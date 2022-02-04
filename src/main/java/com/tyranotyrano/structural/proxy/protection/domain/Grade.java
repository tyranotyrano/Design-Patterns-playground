package com.tyranotyrano.structural.proxy.protection.domain;

public enum Grade {
    MANAGER,
    NORMAL;

    public boolean isManager() {
        return this.equals(MANAGER);
    }

    public boolean isNormal() {
        return this.equals(NORMAL);
    }
}
