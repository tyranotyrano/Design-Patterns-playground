package com.tyranotyrano.behavioral.visitor.element;

import com.tyranotyrano.behavioral.visitor.visitor.Visitor;

public interface Notification {
    String getType();
    void accept(Visitor visitor);
}
