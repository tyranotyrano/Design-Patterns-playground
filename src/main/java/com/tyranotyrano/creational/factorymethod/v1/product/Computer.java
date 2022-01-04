package com.tyranotyrano.creational.factorymethod.v1.product;

public interface Computer {
    String getModelName();
    int getPrice();

    default String getInfo() {
        return "Computer v1 -> Model : " + getModelName() + ", Price : " + getPrice();
    }
}
