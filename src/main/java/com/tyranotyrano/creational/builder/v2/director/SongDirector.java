package com.tyranotyrano.creational.builder.v2.director;

import com.tyranotyrano.creational.builder.v2.builder.SongBuilder;
import com.tyranotyrano.creational.builder.v2.product.Song;

public class SongDirector {
    private SongBuilder songBuilder;

    public SongDirector(SongBuilder songBuilder) {
        this.songBuilder = songBuilder;
    }

    public Song createSong() {
        return songBuilder.builder()
                          .title()
                          .singer()
                          .length()
                          .price()
                          .build();
    }
}
