package com.tyranotyrano.structural.facade.facade;

import com.tyranotyrano.structural.facade.domain.User;
import com.tyranotyrano.structural.facade.subsystem.AuthoritySystem;
import com.tyranotyrano.structural.facade.subsystem.CouponSystem;
import com.tyranotyrano.structural.facade.subsystem.EmailSystem;

public class JoinUserSystem {
    private EmailSystem emailSystem;
    private CouponSystem couponSystem;
    private AuthoritySystem authoritySystem;

    public JoinUserSystem() {
        this.emailSystem = new EmailSystem();
        this.couponSystem = new CouponSystem();
        this.authoritySystem = new AuthoritySystem();
    }

    public void join(User user) {
        emailSystem.sendJoinEmail(user);
        couponSystem.sendWelcomeCoupon(user);
        authoritySystem.grantDefaultAuthority(user);
    }
}
