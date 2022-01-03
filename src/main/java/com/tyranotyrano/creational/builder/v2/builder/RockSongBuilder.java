package com.tyranotyrano.creational.builder.v2.builder;

public class RockSongBuilder extends SongBuilder {

    @Override
    public SongBuilder title() {
        song.setTitle("보헤미안 랩소디");
        return this;
    }

    @Override
    public SongBuilder singer() {
        song.setSinger("퀸");
        return this;
    }

    @Override
    public SongBuilder length() {
        song.setLength(300);
        return this;
    }

    @Override
    public SongBuilder price() {
        song.setPrice(10_000);
        return this;
    }
}
