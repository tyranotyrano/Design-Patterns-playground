package com.tyranotyrano.structural.adapter;

public class USAClassAdapter implements USAProduct, KoreanProduct {

    @Override
    public void operation() {
        this.specificOperation();
    }

    @Override
    public void specificOperation() {
        System.out.println("Class Adapter 방식");
    }
}
