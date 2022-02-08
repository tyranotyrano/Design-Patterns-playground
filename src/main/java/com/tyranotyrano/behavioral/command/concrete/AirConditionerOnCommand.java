package com.tyranotyrano.behavioral.command.concrete;

import com.tyranotyrano.behavioral.command.command.Command;
import com.tyranotyrano.behavioral.command.receiver.AirConditioner;

public class AirConditionerOnCommand implements Command {
    private AirConditioner airConditioner;

    public AirConditionerOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.on();
        airConditioner.onPowerful();
    }
}
