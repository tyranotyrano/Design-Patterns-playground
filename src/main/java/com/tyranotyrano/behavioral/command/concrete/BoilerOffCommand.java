package com.tyranotyrano.behavioral.command.concrete;

import com.tyranotyrano.behavioral.command.command.Command;
import com.tyranotyrano.behavioral.command.receiver.Boiler;

public class BoilerOffCommand implements Command {
    private Boiler boiler;

    public BoilerOffCommand(Boiler boiler) {
        this.boiler = boiler;
    }

    @Override
    public void execute() {
        boiler.off();
    }
}
