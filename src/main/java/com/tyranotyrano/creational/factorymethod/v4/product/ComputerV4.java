package com.tyranotyrano.creational.factorymethod.v4.product;

public interface ComputerV4 {
    String getModelName();
    int getPrice();

    default String getInfo() {
        return "Computer v4 -> Model : " + getModelName() + ", Price : " + getPrice();
    }
}
