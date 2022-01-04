package com.tyranotyrano.creational.factorymethod.v2.product;

public class DesktopV2 implements ComputerV2 {

    @Override
    public String getModelName() {
        return "슈퍼 데스크탑";
    }

    @Override
    public int getPrice() {
        return 1_000_000;
    }
}
