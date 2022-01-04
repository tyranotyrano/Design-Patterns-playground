package com.tyranotyrano.creational.factorymethod.v4.product;

public class DesktopV4 implements ComputerV4 {

    @Override
    public String getModelName() {
        return "싸구려 데스크탑";
    }

    @Override
    public int getPrice() {
        return 10_000;
    }
}
