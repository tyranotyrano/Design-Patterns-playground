package com.tyranotyrano.behavioral.Interpreter.terminal;

import java.util.Map;

public interface Expression {
    int interpret(Map<String, NumberVariable> variables);
}
