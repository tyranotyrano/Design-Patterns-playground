package com.tyranotyrano.behavioral.chainofresponsibility.concrete;

import com.tyranotyrano.behavioral.chainofresponsibility.domain.RewardMember;
import com.tyranotyrano.behavioral.chainofresponsibility.handler.RewardChain;

public class SalesReward implements RewardChain {
    private static final int SALES_AWARD_CRITERIA = 1000;

    private RewardChain chain;

    @Override
    public void setChain(RewardChain chain) {
        this.chain = chain;
    }

    @Override
    public void award(RewardMember rewardMember) {
        if (rewardMember.getSalesAmount() >= SALES_AWARD_CRITERIA) {
            System.out.println(rewardMember.getName() + "님은 [세일즈 우수사원] 입니다.");
        }

        chain.award(rewardMember);
    }
}
