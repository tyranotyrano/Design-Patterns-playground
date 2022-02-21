package com.tyranotyrano.behavioral.observer.v1;

import com.tyranotyrano.behavioral.observer.v1.observer.Leader;
import com.tyranotyrano.behavioral.observer.v1.observer.Member;
import com.tyranotyrano.behavioral.observer.v1.subject.Assignment;

public class ObserverMain {

    public static void main(String[] args) {
        Member owner = Member.of("AAA", "백엔드 개발자");
        Member coworker = Member.of("BBB", "프론트 개발자");
        Leader teamLeader = Leader.of("CCC", "팀장");
        Leader groupLeader = Leader.of("DDD", "그룹장");

        Assignment assignment = Assignment.of("과자 판매", "10개 판매", "상반기 5개 판매", owner);
        assignment.addObserver(coworker);
        assignment.addObserver(teamLeader);
        assignment.addObserver(groupLeader);

        assignment.changeGoal("20개 판매");
    }
}
