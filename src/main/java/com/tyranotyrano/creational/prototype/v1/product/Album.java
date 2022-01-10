package com.tyranotyrano.creational.prototype.v1.product;

import java.util.ArrayList;
import java.util.List;

public class Album implements Cloneable {
    private List<Song> songs;

    public Album() {
        this.songs = new ArrayList<>();
    }

    public void add(Song song) {
        songs.add(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return songs.toString();
    }

    @Override
    public Album clone() {
        Album album = new Album();
        for (Song song : songs) {
            album.add(song);
        }

        return album;
    }
}
