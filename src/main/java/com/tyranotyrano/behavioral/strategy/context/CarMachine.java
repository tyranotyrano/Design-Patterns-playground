package com.tyranotyrano.behavioral.strategy.context;

import com.tyranotyrano.behavioral.strategy.strategy.CarMoveBehavior;

public class CarMachine {
    private CarMoveBehavior moveBehavior;

    private CarMachine(CarMoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

    public static CarMachine from(CarMoveBehavior moveBehavior) {
        return new CarMachine(moveBehavior);
    }

    public void operate() {
        this.moveBehavior.action();
    }

    public void changeMoveBehavior(CarMoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }
}
