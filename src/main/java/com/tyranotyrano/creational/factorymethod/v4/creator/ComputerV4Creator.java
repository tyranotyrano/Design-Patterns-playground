package com.tyranotyrano.creational.factorymethod.v4.creator;

import com.tyranotyrano.creational.factorymethod.v4.product.ComputerV4;

public abstract class ComputerV4Creator {
    public ComputerV4 newComputer() {
        return createComputer();
    }

    protected abstract ComputerV4 createComputer();
}
