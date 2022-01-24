package com.tyranotyrano.structural.facade.subsystem;

import com.tyranotyrano.structural.facade.domain.User;

public class AuthoritySystem {

    public void grantDefaultAuthority(User user) {
        System.out.println("[" + user.getId() + "] 에게 *기본* 권한을 부여하였습니다.");
    }
}
