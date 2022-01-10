package com.tyranotyrano.creational.prototype.v2;

import com.tyranotyrano.creational.prototype.v2.product.AlbumV2;
import com.tyranotyrano.creational.prototype.v2.product.SongV2;

public class PrototypeV2Main {

    public static void main(String[] args) {
        // 1. 원본(Prototype)
        AlbumV2 originAlbum = new AlbumV2();
        originAlbum.add(new SongV2("빅뱅", "거짓말"));
        originAlbum.add(new SongV2("악동뮤지션", "낙하"));
        originAlbum.add(new SongV2("악동뮤지션", "낙하"));

        // 2. 복제(Clone)
        AlbumV2 cloneAlbum = originAlbum.clone();
        cloneAlbum.add(new SongV2("베이식", "08년도 베이식"));

        // 3. 결과비교
        System.out.println(originAlbum);
        System.out.println(cloneAlbum);
    }
}
