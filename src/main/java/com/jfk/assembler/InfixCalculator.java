package com.jfk.assembler;

import java.util.Stack;

public class InfixCalculator {

    public static Integer calculate(String[] expresion){

        Stack<Integer> operands = new Stack<>();
        Stack<String> operators = new Stack<>();

        for (String elem : expresion) {

            try {
                operands.push(Integer.valueOf(elem));
            }
            catch (Exception e){

                if(elem.equals("("))
                    operators.push(elem);

                else if (elem.equals(")")){
                    while(!operators.peek().equals("(")){
                        operands.push(simpleCalculation(operators.pop(), operands.pop(), operands.pop()));
                    }
                    operators.pop();
                }

                else{
                    while(!operators.empty() && hasPriority(elem, operators.peek()))
                        operands.push(simpleCalculation(operators.pop(), operands.pop(), operands.pop()));
                    operators.push(elem);
                }
            }
        }

        while(!operators.empty()){
            operands.push(simpleCalculation(operators.pop(), operands.pop(), operands.pop()));
        }

        return operands.pop();
    }

    private static int simpleCalculation(String operator, Integer b, Integer a) throws UnsupportedOperationException{
        switch(operator){
            case "+":{
                return a + b;
            }
            case "-":{
                return a - b;
            }
            case "*":{
                return a * b;
            }
            case "/":{
                if(b == 0) throw new UnsupportedOperationException("Division by zero");
                return a / b;
            }
        }
        return 0;
    }

    private static boolean hasPriority(String operator1, String operator2){

        if(operator2.equals("(") || operator2.equals(")") )
            return false;

        return (!operator1.equals("*") && !operator1.equals("/")) || (!operator2.equals("+") && !operator2.equals("-"));
    }
}
