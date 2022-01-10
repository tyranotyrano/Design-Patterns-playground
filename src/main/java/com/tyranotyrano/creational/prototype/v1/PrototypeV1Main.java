package com.tyranotyrano.creational.prototype.v1;

import com.tyranotyrano.creational.prototype.v1.product.Album;
import com.tyranotyrano.creational.prototype.v1.product.Song;

public class PrototypeV1Main {

    public static void main(String[] args) {
        // 1. 원본(Prototype)
        Album originAlbum = new Album();
        originAlbum.add(new Song("빅뱅", "거짓말"));
        originAlbum.add(new Song("악동뮤지션", "낙하"));
        originAlbum.add(new Song("악동뮤지션", "낙하"));

        // 2. 복제(Clone)
        Album cloneAlbum = originAlbum.clone();
        cloneAlbum.add(new Song("베이식", "08년도 베이식"));

        // 3. 결과비교
        System.out.println(originAlbum);
        System.out.println(cloneAlbum);
    }
}
