package com.tyranotyrano.behavioral.strategy.context;

import com.tyranotyrano.behavioral.strategy.strategy.CarMoveBehavior;

public class CarMachine {

    public void operate(CarMoveBehavior moveBehavior) {
        moveBehavior.action();
    }
}
