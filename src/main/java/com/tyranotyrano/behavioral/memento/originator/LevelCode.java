package com.tyranotyrano.behavioral.memento.originator;

public class LevelCode extends Code {
    private int level;

    private LevelCode(String code, String name, int level) {
        super(code, name);
        this.level = level;
    }

    public static LevelCode of(String code, String name, int level) {
        return new LevelCode(code, name, level);
    }

    public void changeLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public CodeType getType() {
        return CodeType.LEVEL;
    }
}
