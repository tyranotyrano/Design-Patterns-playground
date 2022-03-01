package com.tyranotyrano.behavioral.visitor.visitor;

import com.tyranotyrano.behavioral.visitor.element.EmailNotification;
import com.tyranotyrano.behavioral.visitor.element.SnsNotification;

public interface Visitor {
    void visit(EmailNotification emailNotification);
    void visit(SnsNotification snsNotification);
}
