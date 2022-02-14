package com.tyranotyrano.behavioral.iterator.domain;

public class Car {
    private String name;
    private int coast;

    public Car(String name, int coast) {
        this.name = name;
        this.coast = coast;
    }

    public static Car of(String name, int coast) {
        return new Car(name, coast);
    }

    public String getInfo() {
        return "[" + name + "] 가격은 " + coast + "원 입니다.";
    }
}
