package com.tyranotyrano.creational.abstractfactory.product;

public class AutoDoor implements Door {

    @Override
    public String getType() {
        return "자동문";
    }

    @Override
    public String getBrand() {
        return "삼성";
    }
}
