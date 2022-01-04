package com.tyranotyrano.creational.factorymethod.v1.creator;

import com.tyranotyrano.creational.factorymethod.v1.product.Computer;

public abstract class ComputerCreator {

    public Computer newComputer() {
        return createComputer();
    }

    protected abstract Computer createComputer();
}
