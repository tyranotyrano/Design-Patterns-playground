package com.tyranotyrano.structural.facade.subsystem;

import com.tyranotyrano.structural.facade.domain.User;

public class CouponSystem {

    public void sendWelcomeCoupon(User user) {
        System.out.println("[" + user.getId() + "] 에게 신규가입 쿠폰을 지급하였습니다.");
    }
}
