package com.tyranotyrano.behavioral.state;

import com.tyranotyrano.behavioral.state.context.SelfAppraisal;

public class StateMain {
    public static void main(String[] args) {
        // 0. Context 생성
        SelfAppraisal selfAppraisal = SelfAppraisal.create();

        // 1. State 변경 : AppraisalReady -> AppraisalStart
        selfAppraisal.proceed();

        // 2. State 변경 : AppraisalStart -> AppraisalDone
        selfAppraisal.proceed();
    }
}
