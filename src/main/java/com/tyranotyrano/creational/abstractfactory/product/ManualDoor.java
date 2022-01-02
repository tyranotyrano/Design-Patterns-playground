package com.tyranotyrano.creational.abstractfactory.product;

public class ManualDoor implements Door {

    @Override
    public String getType() {
        return "수동문";
    }

    @Override
    public String getBrand() {
        return "현대";
    }
}
