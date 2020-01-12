package com.jfk.assembler;

import java.util.Arrays;

public class Calculator {

    private String expresion;
    private boolean isReadyForNext = true;
    private RegisterSet registerSet;
    private String originalExpresion;

    public Calculator(RegisterSet registerSet){
        this.registerSet = registerSet;
        expresion = new String();
    }

    public void setExpresion(String expresion){
        if(isReadyForNext){
            this.expresion = expresion;
            this.originalExpresion = expresion;

            replaceOperators();
            replaceRegisters();

            isReadyForNext = false;
        }
    }

    private void replaceOperators(){
        this.expresion = this.expresion.replaceAll("[+]", " + ");
        this.expresion = this.expresion.replaceAll("[-]", " - ");
        this.expresion = this.expresion.replaceAll("[*]", " * ");
        this.expresion = this.expresion.replaceAll("[/]", " / ");
        this.expresion = this.expresion.replaceAll("[(]", " ( ");
        this.expresion = this.expresion.replaceAll("[)]", " ) ");
    }

    private void replaceRegisters(){
        this.expresion = this.expresion.replaceAll("%eax", String.valueOf(this.registerSet.getEax()));
        this.expresion = this.expresion.replaceAll("%ebx", String.valueOf(this.registerSet.getEbx()));
        this.expresion = this.expresion.replaceAll("%ecx", String.valueOf(this.registerSet.getEcx()));
        this.expresion = this.expresion.replaceAll("%edx", String.valueOf(this.registerSet.getEdx()));
    }

    public Integer calculateExpresion(){
        String[] expresionArray = this.expresion.split(" ");
        expresionArray = Arrays.stream(expresionArray).filter(value -> value.length() > 0).toArray(String[]::new);

        try
        {
            if(expresion.contains("null"))
                return null;
            return InfixCalculator.calculate(expresionArray);
        }
        catch (UnsupportedOperationException e){
            throw e;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public boolean xorOperationMatchesRegister(CurrentRegister currentRegister){
        if(originalExpresion.equals("%eax") && currentRegister == CurrentRegister.EAX)
            return true;
        if(originalExpresion.equals("%ebx") && currentRegister == CurrentRegister.EBX)
            return true;
        if(originalExpresion.equals("%ecx") && currentRegister == CurrentRegister.ECX)
            return true;
        return originalExpresion.equals("%edx") && currentRegister == CurrentRegister.EDX;

    }
}
