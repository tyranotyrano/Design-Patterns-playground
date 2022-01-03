package com.tyranotyrano.creational.builder.v1.builder;

import com.tyranotyrano.creational.builder.v1.product.Book;

public class ComicBookBuilder implements BookBuilder {
    private String name;
    private String author;
    private int price;
    private boolean isBestSeller;
    private String type;

    @Override
    public BookBuilder builder() {
        return new ComicBookBuilder();
    }

    @Override
    public BookBuilder name() {
        name = "정글고";
        return this;
    }

    @Override
    public BookBuilder author() {
        author = "김규삼";
        return this;
    }

    @Override
    public BookBuilder price() {
        price = 5000;
        return this;
    }

    @Override
    public BookBuilder isBestSeller() {
        isBestSeller = true;
        return this;
    }

    @Override
    public BookBuilder type() {
        type = "만화책";
        return this;
    }

    @Override
    public Book build() {
        return new Book(name, author, price, type, isBestSeller);
    }
}
