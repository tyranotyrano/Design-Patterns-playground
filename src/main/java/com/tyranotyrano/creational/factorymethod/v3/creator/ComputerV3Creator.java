package com.tyranotyrano.creational.factorymethod.v3.creator;

import java.util.Objects;

import com.tyranotyrano.creational.factorymethod.v3.product.ComputerV3;

public abstract class ComputerV3Creator {
    private ComputerV3 computer = null;

    public ComputerV3 newComputer() {
        if (Objects.isNull(computer)) {
            computer = createComputer();
        }

        return computer;
    }

    protected abstract ComputerV3 createComputer();
}
