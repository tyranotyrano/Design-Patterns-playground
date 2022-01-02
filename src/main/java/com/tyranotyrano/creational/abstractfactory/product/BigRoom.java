package com.tyranotyrano.creational.abstractfactory.product;

public class BigRoom implements Room {

    @Override
    public int getSize() {
        return 100;
    }

    @Override
    public int getWindowCounts() {
        return 10;
    }
}
