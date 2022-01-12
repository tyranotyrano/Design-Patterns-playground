package com.tyranotyrano.creational.singleton.v2;

public class InitLazySingletonV2Main {

    public static void main(String[] args) {
        // Singleton
        InitLazySingleton firstInstance = InitLazySingleton.getInstance();
        InitLazySingleton secondInstance = InitLazySingleton.getInstance();

        System.out.println(firstInstance);
        System.out.println(secondInstance);
        System.out.println("주소가 같은가? : " + (firstInstance.equals(secondInstance)));
    }
}
