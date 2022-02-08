package com.tyranotyrano.behavioral.Interpreter.terminal;

import java.util.Map;
import java.util.Stack;

public class Calculator implements Expression {
    private final Expression syntaxTree;

    public Calculator(String expression) {
        Stack<Expression> expressionStack = new Stack();

        for (String token : expression.split(" ")) {
            if (token.equals("+")) {
                Expression subExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            }
            else if (token.equals("-")) {
                Expression subExpression = new Minus(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            }
            else {
                expressionStack.push(new Variable(token));
            }
        }

        syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(Map<String, NumberVariable> variables) {
        return syntaxTree.interpret(variables);
    }
}
