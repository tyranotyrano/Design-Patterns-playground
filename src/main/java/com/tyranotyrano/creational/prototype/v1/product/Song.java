package com.tyranotyrano.creational.prototype.v1.product;

public class Song {
    private String singer;
    private String title;

    public Song(String singer, String title) {
        this.singer = singer;
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "가수 : " + singer + ", 노래 제목 : " + title;
    }
}
