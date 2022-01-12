package com.tyranotyrano.creational.singleton.v1;

public class SingletonV1Main {

    public static void main(String[] args) {
        // Singleton
        EarlySingleton firstInstance = EarlySingleton.getInstance();
        EarlySingleton secondInstance = EarlySingleton.getInstance();

        System.out.println(firstInstance);
        System.out.println(secondInstance);
    }
}
