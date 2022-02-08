package com.tyranotyrano.behavioral.command.concrete;

import com.tyranotyrano.behavioral.command.command.Command;
import com.tyranotyrano.behavioral.command.receiver.AirConditioner;

public class AirConditionerOffCommand implements Command {
    private AirConditioner airConditioner;

    public AirConditionerOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.off();
    }
}
