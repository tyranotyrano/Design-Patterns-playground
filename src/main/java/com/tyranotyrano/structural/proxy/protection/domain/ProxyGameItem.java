package com.tyranotyrano.structural.proxy.protection.domain;

import com.tyranotyrano.structural.proxy.protection.exception.NotAuthorizedException;
import com.tyranotyrano.structural.proxy.protection.subject.GameItem;

public class ProxyGameItem implements GameItem {
    private GameItem gameItem;

    private ProxyGameItem(GameItem gameItem) {
        this.gameItem = gameItem;
    }

    public static ProxyGameItem from(GameItem gameItem) {
        return new ProxyGameItem(gameItem);
    }

    @Override
    public Grade getGrade() {
        return gameItem.getGrade();
    }

    @Override
    public String getInfo(Authority authority) {
        switch (authority) {
            case MASTER:
                return gameItem.getInfo(authority);
            case USER:
                if (gameItem.getGrade().isNormal()) {
                    return gameItem.getInfo(authority);
                }
            default:
                throw new NotAuthorizedException("[ERROR] 아이템을 사용 할 수있는 권한이 없습니다.");
        }
    }
}
