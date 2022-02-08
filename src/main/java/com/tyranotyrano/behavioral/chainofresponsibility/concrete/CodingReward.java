package com.tyranotyrano.behavioral.chainofresponsibility.concrete;

import com.tyranotyrano.behavioral.chainofresponsibility.domain.RewardMember;
import com.tyranotyrano.behavioral.chainofresponsibility.handler.RewardChain;

public class CodingReward implements RewardChain {
    private static final int CODING_AWARD_CRITERIA = 10000;

    private RewardChain chain;

    @Override
    public void setChain(RewardChain chain) {
        this.chain = chain;
    }

    @Override
    public void award(RewardMember rewardMember) {
        if (rewardMember.getCodingCount() >= CODING_AWARD_CRITERIA) {
            System.out.println(rewardMember.getName() + "님은 [코딩 우수사원] 입니다.");
        }
    }
}
