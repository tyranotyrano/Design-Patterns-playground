package com.tyranotyrano.creational.builder.v1.builder;

import com.tyranotyrano.creational.builder.v1.product.Book;

public class NovelBookBuilder implements BookBuilder {
    private String name;
    private String author;
    private int price;
    private boolean isBestSeller;
    private String type;

    @Override
    public BookBuilder builder() {
        return new NovelBookBuilder();
    }

    @Override
    public BookBuilder name() {
        name = "삼국지";
        return this;
    }

    @Override
    public BookBuilder author() {
        author = "나관중";
        return this;
    }

    @Override
    public BookBuilder price() {
        price = 10000;
        return this;
    }

    @Override
    public BookBuilder isBestSeller() {
        isBestSeller = false;
        return this;
    }

    @Override
    public BookBuilder type() {
        type = "장편소설";
        return this;
    }

    @Override
    public Book build() {
        return new Book(name, author, price, type, isBestSeller);
    }
}
