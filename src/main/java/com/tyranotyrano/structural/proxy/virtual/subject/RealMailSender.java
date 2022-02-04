package com.tyranotyrano.structural.proxy.virtual.subject;

public class RealMailSender implements MailSender {

    public RealMailSender() {
        System.out.println("[REAL] 객체 생성을 시작합니다.");

        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("(REAL 객체 생성중... " + i + "초)");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println("[REAL] 객체 생성을 완료합니다.");
    }

    @Override
    public void send(String message) {
        System.out.println("[SEND] : " + message);
    }
}
