package com.tyranotyrano.creational.factorymethod.v3.product;

public class DesktopV3 implements ComputerV3 {

    @Override
    public String getModelName() {
        return "PC방 데스크탑";
    }

    @Override
    public int getPrice() {
        return 100_000;
    }
}
