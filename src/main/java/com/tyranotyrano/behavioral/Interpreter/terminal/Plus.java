package com.tyranotyrano.behavioral.Interpreter.terminal;

import java.util.Map;

public class Plus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Plus(Expression left, Expression right) {
        this.leftOperand = left;
        this.rightOperand = right;
    }

    @Override
    public int interpret(Map<String, NumberVariable> variables) {
        int left = leftOperand.interpret(variables);
        int right = rightOperand.interpret(variables);
        System.out.println("[" + left + " + " + right + "] 연산을 합니다.");

        return left + right;
    }
}
