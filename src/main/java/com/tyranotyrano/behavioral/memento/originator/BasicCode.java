package com.tyranotyrano.behavioral.memento.originator;

public class BasicCode extends Code {

    private BasicCode(String code, String name) {
        super(code, name);
    }

    public static BasicCode of(String code, String name) {
        return new BasicCode(code, name);
    }

    @Override
    public CodeType getType() {
        return CodeType.BASIC;
    }
}
