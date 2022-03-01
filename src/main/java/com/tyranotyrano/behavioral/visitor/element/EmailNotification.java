package com.tyranotyrano.behavioral.visitor.element;

import com.tyranotyrano.behavioral.visitor.visitor.Visitor;

public class EmailNotification implements Notification {
    private String sender;
    private String contents;

    public EmailNotification(String sender, String contents) {
        this.sender = sender;
        this.contents = contents;
    }

    @Override
    public String getType() {
        return "EMAIL";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getSender() {
        return sender;
    }

    public String getContents() {
        return contents;
    }
}
