package com.tyranotyrano.creational.factorymethod.v3.creator;

import com.tyranotyrano.creational.factorymethod.v3.product.ComputerV3;
import com.tyranotyrano.creational.factorymethod.v3.product.DesktopV3;

public class DesktopV3Creator extends ComputerV3Creator {

    @Override
    protected ComputerV3 createComputer() {
        return new DesktopV3();
    }
}
