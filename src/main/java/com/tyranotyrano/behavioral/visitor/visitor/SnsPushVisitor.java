package com.tyranotyrano.behavioral.visitor.visitor;

import com.tyranotyrano.behavioral.visitor.element.NoticeNotification;

public class SnsPushVisitor implements Visitor {
    private static final String PREFIX = "[SNS-PUSH]";

    @Override
    public void visit(NoticeNotification noticeNotification) {
        System.out.println(PREFIX + "공지자 : " + noticeNotification.getWriter()
                               + ", 내용 : " + noticeNotification.getContents());
    }
}
