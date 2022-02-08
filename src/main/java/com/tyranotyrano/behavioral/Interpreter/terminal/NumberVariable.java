package com.tyranotyrano.behavioral.Interpreter.terminal;

import java.util.Map;

public class NumberVariable implements Expression {
    private int number;

    public NumberVariable(int number) {
        this.number = number;
    }

    public int interpret(Map<String, NumberVariable> variables) {
        return number;
    }
}
