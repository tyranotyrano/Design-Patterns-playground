package com.tyranotyrano.structural.facade.subsystem;

import com.tyranotyrano.structural.facade.domain.User;

public class EmailSystem {

    public void sendJoinEmail(User user) {
        System.out.println("[" + user.getId() + "(" + user.getEmail() + ")" + "] 에게 가입완료 이메일을 발송하였습니다.");
    }
}
