package com.tyranotyrano.behavioral.visitor;

import com.tyranotyrano.behavioral.visitor.element.NoticeNotification;
import com.tyranotyrano.behavioral.visitor.visitor.EmailPushVisitor;
import com.tyranotyrano.behavioral.visitor.visitor.SnsPushVisitor;

public class VisitorMain {

    public static void main(String[] args) {
        // 0. Element 생성
        NoticeNotification noticeNotification = new NoticeNotification("홍길동", "재택근무를 하세요.");

        // 1. Visitor 생성
        EmailPushVisitor emailPushVisitor = new EmailPushVisitor();
        SnsPushVisitor snsPushVisitor = new SnsPushVisitor();

        // 2. visit 패턴 실행
        noticeNotification.accept(emailPushVisitor);
        noticeNotification.accept(snsPushVisitor);
    }
}
