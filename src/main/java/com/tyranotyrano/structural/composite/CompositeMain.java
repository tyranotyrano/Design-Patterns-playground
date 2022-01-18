package com.tyranotyrano.structural.composite;

import com.tyranotyrano.structural.composite.composite.Directory;
import com.tyranotyrano.structural.composite.leaf.File;

public class CompositeMain {

    /**
     * root
     *  ㄴ movie
     *      ㄴ 스파이더맨
     *      ㄴ 배트맨
     *  ㄴ picture
     *      ㄴ 풍경
     *      ㄴ 건물
     *  ㄴ music
     *      ㄴ pop
     *          ㄴ 버터
     *      ㄴ kpop
     *          ㄴ 큐피트
     *          ㄴ 던던댄스
     */

    public static void main(String[] args) {
        // root
        Directory root = new Directory("root");

        // composite
        Directory movie = new Directory("movie");
        Directory picture = new Directory("picture");
        Directory music = new Directory("music");
        Directory pop = new Directory("pop");
        Directory kpop = new Directory("kpop");

        // leaf
        File 스파이더맨 = new File("스파이더맨");
        File 배트맨 = new File("배트맨");

        File 풍경 = new File("풍경");
        File 건물 = new File("건물");

        File 버터 = new File("버터_BTS");
        File 큐피트 = new File("큐피트_오마이걸");
        File 던던댄스 = new File("던던댄스_오마이걸");

        // 트리 구성
        // 영화
        movie.add(스파이더맨);
        movie.add(배트맨);
        // 사진
        picture.add(풍경);
        picture.add(건물);
        // 노래
        pop.add(버터);
        kpop.add(큐피트);
        kpop.add(던던댄스);
        music.add(pop);
        music.add(kpop);
        // 루트
        root.add(movie);
        root.add(picture);
        root.add(music);

        // 실행
        root.print(0);
    }
}
