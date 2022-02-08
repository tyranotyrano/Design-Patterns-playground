package com.tyranotyrano.behavioral.chainofresponsibility.domain;

public class RewardMember {
    private String name;
    private int lateCount;
    private int salesAmount;
    private int codingCount;

    public RewardMember(String name, int lateCount, int salesAmount, int codingCount) {
        this.name = name;
        this.lateCount = lateCount;
        this.salesAmount = salesAmount;
        this.codingCount = codingCount;
    }

    public String getName() {
        return name;
    }

    public int getLateCount() {
        return lateCount;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public int getCodingCount() {
        return codingCount;
    }
}
