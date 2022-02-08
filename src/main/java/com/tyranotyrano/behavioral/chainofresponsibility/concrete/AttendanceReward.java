package com.tyranotyrano.behavioral.chainofresponsibility.concrete;

import com.tyranotyrano.behavioral.chainofresponsibility.domain.RewardMember;
import com.tyranotyrano.behavioral.chainofresponsibility.handler.RewardChain;

public class AttendanceReward implements RewardChain {
    private static final int ZERO_LATE_COUNT = 0;

    private RewardChain chain;

    @Override
    public void setChain(RewardChain chain) {
        this.chain = chain;
    }

    @Override
    public void award(RewardMember rewardMember) {
        if (rewardMember.getLateCount() == ZERO_LATE_COUNT) {
            System.out.println(rewardMember.getName() + "님은 [근태 우수사원] 입니다.");
        }

        chain.award(rewardMember);
    }
}
