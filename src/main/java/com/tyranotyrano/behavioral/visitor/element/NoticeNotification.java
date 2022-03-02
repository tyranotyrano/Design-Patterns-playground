package com.tyranotyrano.behavioral.visitor.element;

import com.tyranotyrano.behavioral.visitor.visitor.Visitor;

public class NoticeNotification implements Notification {
    private String writer;
    private String contents;

    public NoticeNotification(String writer, String contents) {
        this.writer = writer;
        this.contents = contents;
    }

    @Override
    public String getType() {
        return "NOTICE";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getWriter() {
        return writer;
    }

    public String getContents() {
        return contents;
    }
}
