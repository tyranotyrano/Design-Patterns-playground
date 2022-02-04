package com.tyranotyrano.structural.proxy.protection;

import java.util.ArrayList;
import java.util.List;

import com.tyranotyrano.structural.proxy.protection.domain.Authority;
import com.tyranotyrano.structural.proxy.protection.domain.HealPotion;
import com.tyranotyrano.structural.proxy.protection.domain.NoticeSpeaker;
import com.tyranotyrano.structural.proxy.protection.domain.ProxyGameItem;
import com.tyranotyrano.structural.proxy.protection.domain.Sword;
import com.tyranotyrano.structural.proxy.protection.exception.NotAuthorizedException;
import com.tyranotyrano.structural.proxy.protection.subject.GameItem;

public class ProtectionProxyMain {

    public static void main(String[] args) {
        GameItem healPotion = new HealPotion("체력을 회복한다.");
        GameItem sword = new Sword(100);
        GameItem noticeSpeaker = new NoticeSpeaker("게임 서버를 종료합니다.");

        // 0. 보호 프록시 객체 생성
        List<GameItem> proxyGameItems = new ArrayList<>();
        proxyGameItems.add(ProxyGameItem.from(healPotion));
        proxyGameItems.add(ProxyGameItem.from(sword));
        proxyGameItems.add(ProxyGameItem.from(noticeSpeaker));

        // 1. 일반 유저
        for (GameItem gameItem : proxyGameItems) {
            try {
                System.out.println(gameItem.getInfo(Authority.USER));
            } catch (NotAuthorizedException e) {
                System.out.println("[###ERROR] 권한없음");
            }
        }

        System.out.println();

        // 2. 마스터
        for (GameItem gameItem : proxyGameItems) {
            System.out.println(gameItem.getInfo(Authority.MASTER));
        }
    }
}
