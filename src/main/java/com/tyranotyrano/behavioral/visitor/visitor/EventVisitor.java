package com.tyranotyrano.behavioral.visitor.visitor;

import com.tyranotyrano.behavioral.visitor.element.EmailNotification;
import com.tyranotyrano.behavioral.visitor.element.SnsNotification;

public class EventVisitor implements Visitor {
    private static final String PREFIX = "[EVENT]";

    @Override
    public void visit(EmailNotification emailNotification) {
        System.out.println(PREFIX + emailNotification.getContents());
    }

    @Override
    public void visit(SnsNotification snsNotification) {
        System.out.println(PREFIX + snsNotification.getMessage());
    }
}
