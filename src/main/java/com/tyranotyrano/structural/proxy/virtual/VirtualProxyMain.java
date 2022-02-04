package com.tyranotyrano.structural.proxy.virtual;

import java.util.ArrayList;
import java.util.List;

import com.tyranotyrano.structural.proxy.virtual.subject.MailSender;
import com.tyranotyrano.structural.proxy.virtual.subject.ProxyMailSender;
import com.tyranotyrano.structural.proxy.virtual.subject.RealMailSender;

public class VirtualProxyMain {

    public static void main(String[] args) {
        // 1. Real Object 를 생성한 경우
        MailSender readMailSender = new RealMailSender();
        readMailSender.send("Read Object 가 메일을 전송합니다.");

        System.out.println();

        // 2. Proxy Object 를 생성한 경우
        List<MailSender> mailSenders = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            mailSenders.add(new ProxyMailSender("프록시" + i));
        }

        mailSenders.get(0).send("메일을 전송합니다.");
    }
}
