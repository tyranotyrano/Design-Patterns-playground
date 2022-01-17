package com.tyranotyrano.structural.adapter;

public class USAObjectAdapter implements USAProduct {
    private final KoreanProduct koreanProduct;

    public USAObjectAdapter(KoreanProduct koreanProduct) {
        this.koreanProduct = koreanProduct;
    }

    @Override
    public void operation() {
        this.koreanProduct.specificOperation();
    }
}
