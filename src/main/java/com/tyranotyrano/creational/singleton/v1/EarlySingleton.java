package com.tyranotyrano.creational.singleton.v1;

public class EarlySingleton {
    private static EarlySingleton instance = new EarlySingleton();

    private EarlySingleton() {}

    public static EarlySingleton getInstance() {
        return instance;
    }
}
