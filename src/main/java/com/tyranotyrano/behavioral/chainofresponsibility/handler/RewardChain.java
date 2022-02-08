package com.tyranotyrano.behavioral.chainofresponsibility.handler;

import com.tyranotyrano.behavioral.chainofresponsibility.domain.RewardMember;

public interface RewardChain {
    void award(RewardMember rewardMember);
    void setChain(RewardChain chain);
}
