package com.tyranotyrano.behavioral.mediator;

import com.tyranotyrano.behavioral.mediator.colleague.MobileColleague;
import com.tyranotyrano.behavioral.mediator.colleague.TabletColleague;
import com.tyranotyrano.behavioral.mediator.colleague.WebColleague;
import com.tyranotyrano.behavioral.mediator.mediator.NotificationMediator;

public class MediatorMain {

    public static void main(String[] args) {
        // 0. Mediator, Colleague 생성
        NotificationMediator notificationMediator = new NotificationMediator();
        WebColleague webColleague = new WebColleague(notificationMediator, "크롬");
        MobileColleague mobileColleague = new MobileColleague(notificationMediator, "갤럭시");
        TabletColleague tabletColleague = new TabletColleague(notificationMediator, "아이패드");

        // 1. Mediator, Colleague 연결
        notificationMediator.add(webColleague);
        notificationMediator.add(mobileColleague);
        notificationMediator.add(tabletColleague);

        // 2. 콘텐츠 송신/수신
        webColleague.send("웹에서 보낸 콘텐츠입니다.");
    }
}
