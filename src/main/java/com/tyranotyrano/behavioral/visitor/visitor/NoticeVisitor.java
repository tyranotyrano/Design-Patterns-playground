package com.tyranotyrano.behavioral.visitor.visitor;

import com.tyranotyrano.behavioral.visitor.element.EmailNotification;
import com.tyranotyrano.behavioral.visitor.element.SnsNotification;

public class NoticeVisitor implements Visitor{
    private static final String PREFIX = "[NOTICE]";

    @Override
    public void visit(EmailNotification emailNotification) {
        System.out.println(PREFIX + "공지자 : " + emailNotification.getSender()
                                  + ", 내용 : " + emailNotification.getContents());
    }

    @Override
    public void visit(SnsNotification snsNotification) {
        System.out.println(PREFIX + snsNotification.getMessage());
    }
}
