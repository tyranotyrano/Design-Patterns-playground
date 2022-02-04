package com.tyranotyrano.structural.proxy.protection.domain;

import com.tyranotyrano.structural.proxy.protection.subject.GameItem;

public class NoticeSpeaker implements GameItem {
    private String message;

    public NoticeSpeaker(String message) {
        this.message = message;
    }

    @Override
    public Grade getGrade() {
        return Grade.MANAGER;
    }

    @Override
    public String getInfo(Authority authority) {
        return authority.name() + " 이(가) [MANAGER] 등급의 \"공지\"를 사용합니다. (메세지 : " + message + ")";
    }
}
