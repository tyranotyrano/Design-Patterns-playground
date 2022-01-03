package com.tyranotyrano.creational.builder.v2.builder;

public class KpopSongBuilder extends SongBuilder {

    @Override
    public SongBuilder title() {
        song.setTitle("던던 댄스");
        return this;
    }

    @Override
    public SongBuilder singer() {
        song.setSinger("오마이걸");
        return this;
    }

    @Override
    public SongBuilder length() {
        song.setLength(180);
        return this;
    }

    @Override
    public SongBuilder price() {
        song.setPrice(5_000);
        return this;
    }
}
