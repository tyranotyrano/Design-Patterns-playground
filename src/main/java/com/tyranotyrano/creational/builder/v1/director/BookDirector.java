package com.tyranotyrano.creational.builder.v1.director;

import com.tyranotyrano.creational.builder.v1.builder.BookBuilder;
import com.tyranotyrano.creational.builder.v1.product.Book;

public class BookDirector {
    private BookBuilder bookBuilder;

    public BookDirector(BookBuilder bookBuilder) {
        this.bookBuilder = bookBuilder;
    }

    public Book createBook() {
        return bookBuilder.builder()
                          .name()
                          .author()
                          .price()
                          .isBestSeller()
                          .type()
                          .build();
    }
}
