package com.tyranotyrano.creational.abstractfactory.product;

public class SmallRoom implements Room {

    @Override
    public int getSize() {
        return 10;
    }

    @Override
    public int getWindowCounts() {
        return 1;
    }
}
