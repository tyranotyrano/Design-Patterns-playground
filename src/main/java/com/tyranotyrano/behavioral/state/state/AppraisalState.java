package com.tyranotyrano.behavioral.state.state;

import com.tyranotyrano.behavioral.state.context.SelfAppraisal;

public interface AppraisalState {
    void completeStep(SelfAppraisal selfAppraisal);
    void printCurrentState();
}
