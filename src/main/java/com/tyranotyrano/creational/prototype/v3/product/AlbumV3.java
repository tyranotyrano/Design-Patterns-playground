package com.tyranotyrano.creational.prototype.v3.product;

import java.util.ArrayList;
import java.util.List;

import com.tyranotyrano.creational.prototype.v3.prototype.Prototype;

public class AlbumV3 implements Prototype {
    private List<SongV3> songs;

    public AlbumV3() {
        this.songs = new ArrayList<>();
    }

    public void add(SongV3 song) {
        songs.add(song);
    }

    public List<SongV3> getSongs() {
        return songs;
    }

    @Override
    public String toString() {
        return songs.toString();
    }

    @Override
    public Prototype copy() {
        AlbumV3 album = new AlbumV3();
        for (SongV3 song : songs) {
            album.add(song);
        }

        return album;
    }
}
