package com.tyranotyrano.creational.prototype.v2.product;

import java.util.ArrayList;
import java.util.List;

public class AlbumV2 implements Cloneable {
    private List<SongV2> songs;

    public AlbumV2() {
        this.songs = new ArrayList<>();
    }

    public void add(SongV2 song) {
        songs.add(song);
    }

    public void clear() {
        songs.clear();
    }

    public void copySongs(List<SongV2> songs) {
        this.songs = new ArrayList<>(songs);
    }

    @Override
    public String toString() {
        return songs.toString();
    }

    @Override
    public AlbumV2 clone() {
        try {
            AlbumV2 album = (AlbumV2) super.clone();
            album.copySongs(songs);

            return album;
        } catch (CloneNotSupportedException e) {
            // empty or etc ...
            return new AlbumV2();
        }
    }
}
