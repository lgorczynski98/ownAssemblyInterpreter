package com.jfk.assembler;

public class Interpreter {

    public static void runIntExpresion(Stack stack){
        System.out.println(stack.pop());
    }

    public static void runPushExpresion(Stack stack, Integer value){
        stack.push(value);
    }

    public static void runMovExpresion(Integer value, RegisterSet registerSet, CurrentRegister currentRegister){
        setCurrentRegisterValue(currentRegister, registerSet, value);
    }

    public static void runXorExpresion(Integer value, RegisterSet registerSet, CurrentRegister currentRegister){
        setCurrentRegisterValueAfterXor(currentRegister, registerSet, value);
    }

    public static void runXorForSameExpresions(RegisterSet registerSet, CurrentRegister currentRegister){
        switch (currentRegister){
            case EAX:{
                registerSet.setEax(0);
                break;
            }
            case EBX:{
                registerSet.setEbx(0);
                break;
            }
            case ECX:{
                registerSet.setEcx(0);
                break;
            }
            case EDX:{
                registerSet.setEdx(0);
            }
        }
    }

    private static void setCurrentRegisterValue(CurrentRegister currentRegister, RegisterSet registerSet, Integer value){
        switch (currentRegister){
            case EAX:
                registerSet.setEax(value);
                break;
            case EBX:
                registerSet.setEbx(value);
                break;
            case ECX:
                registerSet.setEcx(value);
                break;
            case EDX:
                registerSet.setEdx(value);
        }
    }

    private static void setCurrentRegisterValueAfterXor(CurrentRegister currentRegister, RegisterSet registerSet, Integer value){
        switch (currentRegister){
            case EAX:
                if(registerSet.getEax() != null && value != null)
                    registerSet.setEax(value^registerSet.getEax());
                else
                    registerSet.setEax(null);
                break;
            case EBX:
                if(registerSet.getEbx() != null && value != null)
                    registerSet.setEbx(value^registerSet.getEbx());
                else
                    registerSet.setEbx(null);
                break;
            case ECX:
                if(registerSet.getEcx() != null && value != null)
                    registerSet.setEcx(value^registerSet.getEcx());
                else
                    registerSet.setEcx(null);
                break;
            case EDX:
                if(registerSet.getEdx() != null && value != null)
                    registerSet.setEdx(value^registerSet.getEdx());
                else
                    registerSet.setEcx(null);
        }
    }
}
