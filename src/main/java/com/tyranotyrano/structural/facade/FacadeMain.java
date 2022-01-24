package com.tyranotyrano.structural.facade;

import com.tyranotyrano.creational.singleton.v1.EarlySingleton;
import com.tyranotyrano.structural.facade.domain.User;
import com.tyranotyrano.structural.facade.facade.JoinUserSystem;
import com.tyranotyrano.structural.facade.subsystem.AuthoritySystem;
import com.tyranotyrano.structural.facade.subsystem.CouponSystem;
import com.tyranotyrano.structural.facade.subsystem.EmailSystem;

public class FacadeMain {

    public static void main(String[] args) {
        // 0. User 생성
        User user = User.createForJoin("tyrano", "mid@sit147", "tyrano09@gmail.com");

        // 1. Facade 패턴 적용 전
        EmailSystem emailSystem = new EmailSystem();
        CouponSystem couponSystem = new CouponSystem();
        AuthoritySystem authoritySystem = new AuthoritySystem();

        emailSystem.sendJoinEmail(user);
        couponSystem.sendWelcomeCoupon(user);
        authoritySystem.grantDefaultAuthority(user);

        System.out.println();

        // 2. Facade 패턴 적용 후
        JoinUserSystem joinUserSystem = new JoinUserSystem();
        joinUserSystem.join(user);
    }
}
