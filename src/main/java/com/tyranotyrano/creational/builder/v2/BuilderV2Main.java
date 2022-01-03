package com.tyranotyrano.creational.builder.v2;

import com.tyranotyrano.creational.builder.v2.builder.KpopSongBuilder;
import com.tyranotyrano.creational.builder.v2.builder.RockSongBuilder;
import com.tyranotyrano.creational.builder.v2.director.SongDirector;
import com.tyranotyrano.creational.builder.v2.product.Song;

public class BuilderV2Main {

    public static void main(String[] args) {
        // 1. Kpop
        SongDirector kpopSongDirector = new SongDirector(new KpopSongBuilder());
        Song kpop = kpopSongDirector.createSong();
        System.out.println(kpop);

        // 2. Rock
        SongDirector rockSongDirector = new SongDirector(new RockSongBuilder());
        Song rock = rockSongDirector.createSong();
        System.out.println(rock);
    }
}
