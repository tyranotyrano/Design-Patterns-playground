package com.tyranotyrano.behavioral.mediator.colleague;

import com.tyranotyrano.behavioral.mediator.mediator.Mediator;

public class WebColleague extends Colleague {

    public WebColleague(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String contents) {
        System.out.println("[Web-" + this.name + "]" + " 메세지를 보냅니다. ===> " + contents);
        mediator.sendContents(contents, this);
    }

    @Override
    public void receive(String contents) {
        System.out.println("[Web-" + this.name + "]" + " 메세지를 수신하였습니다. ===> " + contents);
    }
}
