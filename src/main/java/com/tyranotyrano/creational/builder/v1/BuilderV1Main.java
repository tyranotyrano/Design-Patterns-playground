package com.tyranotyrano.creational.builder.v1;

import com.tyranotyrano.creational.builder.v1.builder.ComicBookBuilder;
import com.tyranotyrano.creational.builder.v1.builder.NovelBookBuilder;
import com.tyranotyrano.creational.builder.v1.director.BookDirector;
import com.tyranotyrano.creational.builder.v1.product.Book;

public class BuilderV1Main {

    public static void main(String[] args) {
        // 1. 만화책
        BookDirector comicBookDirector = new BookDirector(new ComicBookBuilder());
        Book comicBook = comicBookDirector.createBook();
        System.out.println(comicBook);

        // 2. 장편 소설
        BookDirector novelBookDirector = new BookDirector(new NovelBookBuilder());
        Book novelBook = novelBookDirector.createBook();
        System.out.println(novelBook);
    }
}
