package com.tyranotyrano.behavioral.visitor;

import com.tyranotyrano.behavioral.visitor.element.EmailNotification;
import com.tyranotyrano.behavioral.visitor.element.SnsNotification;
import com.tyranotyrano.behavioral.visitor.visitor.EventVisitor;
import com.tyranotyrano.behavioral.visitor.visitor.NoticeVisitor;

public class VisitorMain {
    public static void main(String[] args) {
        // 0. Element 생성
        EmailNotification emailNotification = new EmailNotification("홍길동", "재택근무를 하세요.");
        SnsNotification snsNotification = new SnsNotification("코로나 상황에 주의해주세요.");

        // 1. Visitor 생성
        NoticeVisitor noticeVisitor = new NoticeVisitor();
        EventVisitor eventVisitor = new EventVisitor();

        // 2. visit 패턴 실행
        emailNotification.accept(noticeVisitor);
        snsNotification.accept(eventVisitor);
    }
}
