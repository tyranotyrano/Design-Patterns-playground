package com.tyranotyrano.behavioral.memento.memento;

import com.tyranotyrano.behavioral.memento.originator.Code;
import com.tyranotyrano.behavioral.memento.originator.CodeType;
import com.tyranotyrano.behavioral.memento.originator.LevelCode;

public class CodeSnapshot {
    private String code;
    private String name;
    private Integer level;
    private CodeType codeType;

    private CodeSnapshot(String code, String name, Integer level, CodeType codeType) {
        this.code = code;
        this.name = name;
        this.level = level;
        this.codeType = codeType;
    }

    public static CodeSnapshot from(Code code) {
        Integer level = null;

        if (code.getType().isLevel()) {
            level = ((LevelCode)code).getLevel();
        }

        return new CodeSnapshot(code.getCode(), code.getName(), level, code.getType());
    }

    public String getInfo() {
        return "[" + codeType.name() + "] code = " + code + ", name = " + name + ", level = " + level;
    }
}
