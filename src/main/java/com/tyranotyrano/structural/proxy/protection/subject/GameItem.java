package com.tyranotyrano.structural.proxy.protection.subject;

import com.tyranotyrano.structural.proxy.protection.domain.Authority;
import com.tyranotyrano.structural.proxy.protection.domain.Grade;

public interface GameItem {
    Grade getGrade();
    String getInfo(Authority authority);
}
