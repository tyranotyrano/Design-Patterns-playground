package com.tyranotyrano.behavioral.state.state;

import com.tyranotyrano.behavioral.state.context.SelfAppraisal;

public class AppraisalDone implements AppraisalState {

    @Override
    public void completeStep(SelfAppraisal selfAppraisal) {
        throw new RuntimeException("완료된 평가");
    }

    @Override
    public void printCurrentState() {
        System.out.println("[평가 완료] 평가를 완료하였습니다.");
    }
}
