package com.tyranotyrano.behavioral.Interpreter;

import java.util.HashMap;
import java.util.Map;

import com.tyranotyrano.behavioral.Interpreter.terminal.Calculator;
import com.tyranotyrano.behavioral.Interpreter.terminal.NumberVariable;

public class InterpreterMain {
    public static void main(String[] args) {
        // 0. Expression(표현식)
        String expression = "w x z - +";
        Calculator calculator = new Calculator(expression);

        // 1. Terminal 생성
        Map<String, NumberVariable> variables = new HashMap();
        variables.put("w", new NumberVariable(5));
        variables.put("x", new NumberVariable(10));
        variables.put("z", new NumberVariable(42));

        // 2. 결과
        System.out.println("result : " + calculator.interpret(variables));
    }
}
