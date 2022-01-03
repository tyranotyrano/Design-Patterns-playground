package com.tyranotyrano.creational.builder.v1.product;

public class Book {
    private String name;
    private String author;
    private int price;
    private String type;
    private boolean isBestSeller;

    public Book(String name, String author, int price, String type, boolean isBestSeller) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.isBestSeller = isBestSeller;
    }

    @Override
    public String toString() {
        return "Book{" +
            "name='" + name + '\'' +
            ", author='" + author + '\'' +
            ", price=" + price +
            ", type='" + type + '\'' +
            ", isBestSeller=" + isBestSeller +
            '}';
    }
}
