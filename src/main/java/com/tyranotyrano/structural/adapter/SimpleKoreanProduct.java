package com.tyranotyrano.structural.adapter;

public class SimpleKoreanProduct implements KoreanProduct {

    @Override
    public void specificOperation() {
        System.out.println("Object Adapter 방식");
    }
}
