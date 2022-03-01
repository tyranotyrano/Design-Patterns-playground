package com.tyranotyrano.behavioral.visitor.element;

import com.tyranotyrano.behavioral.visitor.visitor.Visitor;

public class SnsNotification implements Notification {
    private String message;

    public SnsNotification(String message) {
        this.message = message;
    }

    @Override
    public String getType() {
        return "SNS";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getMessage() {
        return message;
    }
}
