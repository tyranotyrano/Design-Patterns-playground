package com.tyranotyrano.structural.proxy.virtual.subject;

import java.util.Objects;

public class ProxyMailSender implements MailSender {
    private String name = null;
    private MailSender mailSender = null;

    public ProxyMailSender(String name) {
        this.name = name;
        System.out.println("[PROXY] 객체 생성을 시작합니다. : " + name);
        System.out.println("[PROXY] 객체 생성을 완료합니다.");
    }

    @Override
    public void send(String message) {
        System.out.println("[PROXY-" + name + "] Real 객체를 생성하고, 메일을 발송합니다.");

        if (Objects.isNull(mailSender)) {
            mailSender = new RealMailSender();
        }

        System.out.println("[#PROXY] before process");
        mailSender.send(message);
        System.out.println("[#PROXY] after process");
    }
}
