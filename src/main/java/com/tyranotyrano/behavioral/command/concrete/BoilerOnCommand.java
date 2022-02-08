package com.tyranotyrano.behavioral.command.concrete;

import com.tyranotyrano.behavioral.command.command.Command;
import com.tyranotyrano.behavioral.command.receiver.Boiler;

public class BoilerOnCommand implements Command {
    private Boiler boiler;

    public BoilerOnCommand(Boiler boiler) {
        this.boiler = boiler;
    }

    @Override
    public void execute() {
        boiler.on();
        boiler.onAuto();
    }
}
