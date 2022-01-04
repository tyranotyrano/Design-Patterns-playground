package com.tyranotyrano.creational.factorymethod.v2.product;

public interface ComputerV2 {
    String getModelName();
    int getPrice();

    default String getInfo() {
        return "Model : " + getModelName() + ", Price : " + getPrice();
    }
}
