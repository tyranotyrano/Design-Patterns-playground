package com.tyranotyrano.creational.prototype.v3;

import com.tyranotyrano.creational.prototype.v3.product.AlbumV3;
import com.tyranotyrano.creational.prototype.v3.product.SongV3;

public class PrototypeV3Main {

    public static void main(String[] args) {
        // 1. 원본(Prototype)
        AlbumV3 originAlbum = new AlbumV3();
        originAlbum.add(new SongV3("빅뱅", "거짓말"));
        originAlbum.add(new SongV3("악동뮤지션", "낙하"));
        originAlbum.add(new SongV3("악동뮤지션", "낙하"));

        // 2. 복제(Clone)
        AlbumV3 cloneAlbum = (AlbumV3) originAlbum.copy();
        cloneAlbum.add(new SongV3("베이식", "08년도 베이식"));

        // 3. 결과비교
        System.out.println(originAlbum);
        System.out.println(cloneAlbum);
    }
}
