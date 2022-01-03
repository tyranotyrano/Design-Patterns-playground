package com.tyranotyrano.creational.builder.v2.builder;

import com.tyranotyrano.creational.builder.v2.product.Song;

public abstract class SongBuilder {
    protected Song song;

    public SongBuilder builder() {
        this.song = new Song();
        return this;
    }

    public Song build() {
        return song;
    }

    public abstract SongBuilder title();
    public abstract SongBuilder singer();
    public abstract SongBuilder length();
    public abstract SongBuilder price();
}
