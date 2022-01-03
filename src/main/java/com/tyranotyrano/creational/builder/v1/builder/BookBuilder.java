package com.tyranotyrano.creational.builder.v1.builder;

import com.tyranotyrano.creational.builder.v1.product.Book;

public interface BookBuilder {
    BookBuilder builder();
    BookBuilder name();
    BookBuilder author();
    BookBuilder price();
    BookBuilder isBestSeller();
    BookBuilder type();
    Book build();
}
