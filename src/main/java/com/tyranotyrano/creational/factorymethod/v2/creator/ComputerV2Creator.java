package com.tyranotyrano.creational.factorymethod.v2.creator;

import com.tyranotyrano.creational.factorymethod.v2.product.ComputerV2;
import com.tyranotyrano.creational.factorymethod.v2.product.DesktopV2;
import com.tyranotyrano.creational.factorymethod.v2.product.NotebookV2;

public class ComputerV2Creator {

    public static ComputerV2 createComputer(ComputerV2Type type) {
        switch (type) {
            case DESKTOP:
                return new DesktopV2();
            case NOTEBOOK:
                return new NotebookV2();
            default:
                throw new IllegalArgumentException(String.format("ComputerType 이 올바르지 않습니다. type=%s", type));
        }
    }
}
