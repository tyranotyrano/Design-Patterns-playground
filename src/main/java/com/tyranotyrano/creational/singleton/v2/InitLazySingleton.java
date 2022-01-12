package com.tyranotyrano.creational.singleton.v2;

import java.util.Objects;

public class InitLazySingleton {
    private static InitLazySingleton instance;

    private InitLazySingleton() {}

    public static InitLazySingleton getInstance() {
        if (Objects.isNull(instance)) {
            instance = new InitLazySingleton();
        }

        return instance;
    }
}
