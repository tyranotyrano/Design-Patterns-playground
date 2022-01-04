package com.tyranotyrano.creational.factorymethod.v1.product;

public interface Computer {
    String getModelName();
    int getPrice();

    default String getInfo() {
        return "Model : " + getModelName() + ", Price : " + getPrice();
    }
}
