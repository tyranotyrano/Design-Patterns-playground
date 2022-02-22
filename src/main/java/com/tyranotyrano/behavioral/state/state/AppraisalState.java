package com.tyranotyrano.behavioral.state.state;

public interface AppraisalState {
    AppraisalState completeStep();
    void printCurrentState();
}
