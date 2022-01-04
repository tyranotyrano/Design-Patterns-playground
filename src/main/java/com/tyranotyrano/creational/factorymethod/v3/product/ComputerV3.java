package com.tyranotyrano.creational.factorymethod.v3.product;

public interface ComputerV3 {
    String getModelName();
    int getPrice();

    default String getInfo() {
        return "Computer v3 -> Model : " + getModelName() + ", Price : " + getPrice();
    }
}
