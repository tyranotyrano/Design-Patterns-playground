package com.tyranotyrano.structural.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        // 1. Class Adapter 방식
        USAProduct usaProductByClassAdapter = new USAClassAdapter();
        usaProductByClassAdapter.operation();

        // 2. Object Adapter 방식
        USAProduct usaProductByObjectAdapter = new USAObjectAdapter(new SimpleKoreanProduct());
        usaProductByObjectAdapter.operation();
    }
}
