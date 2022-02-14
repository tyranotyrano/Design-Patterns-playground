package com.tyranotyrano.behavioral.mediator.colleague;

import com.tyranotyrano.behavioral.mediator.mediator.Mediator;

public abstract class Colleague {
    protected Mediator mediator;
    protected String name;

    protected Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String contents);
    public abstract void receive(String contents);
}
