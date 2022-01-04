package com.tyranotyrano.creational.factorymethod.v1.creator;

import com.tyranotyrano.creational.factorymethod.v1.product.Computer;
import com.tyranotyrano.creational.factorymethod.v1.product.Desktop;

public class DesktopCreator extends ComputerCreator {

    @Override
    protected Computer createComputer() {
        return new Desktop();
    }
}
