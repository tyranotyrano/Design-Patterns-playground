package com.tyranotyrano.behavioral.memento.originator;

import com.tyranotyrano.behavioral.memento.memento.CodeSnapshot;

public abstract class Code {
    private String code;
    private String name;

    protected Code(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public abstract CodeType getType();

    public void changeName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public CodeSnapshot createSnapshot() {
        return CodeSnapshot.from(this);
    }
}
