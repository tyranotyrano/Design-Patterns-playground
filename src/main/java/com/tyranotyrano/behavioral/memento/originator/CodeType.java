package com.tyranotyrano.behavioral.memento.originator;

public enum CodeType {
    BASIC,
    LEVEL;

    public boolean isBasic() {
        return this.equals(BASIC);
    }

    public boolean isLevel() {
        return this.equals(LEVEL);
    }
}
