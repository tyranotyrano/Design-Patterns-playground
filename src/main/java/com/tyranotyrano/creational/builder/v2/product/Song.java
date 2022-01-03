package com.tyranotyrano.creational.builder.v2.product;

public class Song {
    private String title;
    private String singer;
    private int length;
    private int price;

    public Song() {}

    public Song(String title, String singer, int length, int price) {
        this.title = title;
        this.singer = singer;
        this.length = length;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Song{" +
            "title='" + title + '\'' +
            ", singer='" + singer + '\'' +
            ", length=" + length +
            ", price=" + price +
            '}';
    }
}
