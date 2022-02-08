package com.tyranotyrano.behavioral.chainofresponsibility;

import com.tyranotyrano.behavioral.chainofresponsibility.concrete.AttendanceReward;
import com.tyranotyrano.behavioral.chainofresponsibility.concrete.CodingReward;
import com.tyranotyrano.behavioral.chainofresponsibility.concrete.SalesReward;
import com.tyranotyrano.behavioral.chainofresponsibility.domain.RewardMember;
import com.tyranotyrano.behavioral.chainofresponsibility.handler.RewardChain;

public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        // 0. RewardMember 도메인 모델 새성
        RewardMember rewardMember1 = new RewardMember("홍길동", 0, 0, 100);
        RewardMember rewardMember2 = new RewardMember("임꺽정", 10, 500, 10000);
        RewardMember rewardMember3 = new RewardMember("케로로", 0, 2000, 30000);

        // 1. Chain Handler 구성
        RewardChain attendanceRewardChain = new AttendanceReward();
        RewardChain salesRewardChain = new SalesReward();
        RewardChain codingRewardChain = new CodingReward();

        attendanceRewardChain.setChain(salesRewardChain);
        salesRewardChain.setChain(codingRewardChain);

        // 2. 실행
        attendanceRewardChain.award(rewardMember1);
        System.out.println();

        attendanceRewardChain.award(rewardMember2);
        System.out.println();

        attendanceRewardChain.award(rewardMember3);
    }
}
