package com.jfk.assembler;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();
        RegisterSet registerSet = new RegisterSet();
        Scanner scanner = new Scanner(System.in);
        String entrance;

        while(true){

            Calculator calculator = new Calculator(registerSet);
            try {
                entrance = scanner.nextLine();
                if(entrance.equals(""))
                    continue;
                if(hasMultiSpace(entrance)){
                    System.out.println("Error");
                    continue;
                }
                entrance += "\n";
            }
            catch(NoSuchElementException e) {
                break;
            }

            gParser parser = prepareAntlrParser(entrance);
            ParseTree parseTree = prepareAntlrParseTree(parser);

            if(parser.getNumberOfSyntaxErrors() > 0){
                System.out.println("Error");
                continue;
            }

            Visitor<Object> visitor = new Visitor<>(calculator);
            visitor.visit(parseTree);

            try {
                instructionHandling(visitor, stack, registerSet, calculator);
            }
            catch (UnsupportedOperationException e){
                System.out.println("Error");
            }
        }
    }

    private static void instructionHandling(Visitor<Object> visitor, Stack stack, RegisterSet registerSet, Calculator calculator){
        switch(visitor.getCurrentInstruction()){
            case INT:{
                Interpreter.runIntExpresion(stack);
                break;
            }
            case PUSH:{
                Interpreter.runPushExpresion(stack, calculator.calculateExpresion());
                break;
            }
            case MOV:{
                Interpreter.runMovExpresion(calculator.calculateExpresion(), registerSet, visitor.getCurrentRegister());
                break;
            }
            case XOR:{
                if (!calculator.xorOperationMatchesRegister(visitor.getCurrentRegister()))
                    Interpreter.runXorExpresion(calculator.calculateExpresion(), registerSet, visitor.getCurrentRegister());
                else
                    Interpreter.runXorForSameExpresions(registerSet, visitor.getCurrentRegister());
            }
        }
    }

    private static boolean hasMultiSpace(String entrance){
        int lastIndex = 0;
        for (int i = entrance.length() - 1; i >= 0; i--) {
            char c = entrance.toCharArray()[i];
            if(c != ' ' && c != '\t'){
                lastIndex = i + 1;
                break;
            }
        }
        String subEntrance = entrance.substring(0, lastIndex);
        String pattern = "[ ]{2}";
        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(subEntrance);
        return matcher.find();
    }

    private static gParser prepareAntlrParser(String entrance){
        CharStream charStream = CharStreams.fromString(entrance);
        gLexer lexer = new gLexer(charStream);
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        return new gParser(tokenStream);

    }

    private static ParseTree prepareAntlrParseTree(gParser parser){
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        return parser.start();
    }
}
