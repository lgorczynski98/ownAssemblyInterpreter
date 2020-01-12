package com.jfk.assembler;

import java.util.LinkedList;
import java.util.List;

public class Stack
{
    private List<Integer> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(Integer value){
        stack.add(0, value);
    }

    public String pop(){
        if(stack.size() != 0){
            Integer result = stack.get(0);
            stack.remove(0);
            if(result == null)
                return "???";
            return String.valueOf(result);
        }
        else{
            return "???";
        }
    }
}
