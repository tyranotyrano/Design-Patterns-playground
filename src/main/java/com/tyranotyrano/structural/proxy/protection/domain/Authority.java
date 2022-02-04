package com.tyranotyrano.structural.proxy.protection.domain;

public enum Authority {
    MASTER,
    USER;

    public boolean isMaster() {
        return this.equals(MASTER);
    }

    public boolean isUser() {
        return this.equals(USER);
    }
}
