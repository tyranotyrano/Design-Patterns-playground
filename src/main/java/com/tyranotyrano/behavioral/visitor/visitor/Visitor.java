package com.tyranotyrano.behavioral.visitor.visitor;

import com.tyranotyrano.behavioral.visitor.element.NoticeNotification;

public interface Visitor {
    void visit(NoticeNotification notification);
}
