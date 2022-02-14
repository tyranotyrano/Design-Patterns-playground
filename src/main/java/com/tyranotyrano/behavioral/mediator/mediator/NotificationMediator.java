package com.tyranotyrano.behavioral.mediator.mediator;

import java.util.ArrayList;
import java.util.List;

import com.tyranotyrano.behavioral.mediator.colleague.Colleague;

public class NotificationMediator implements Mediator {
    private final List<Colleague> medias = new ArrayList<>();

    @Override
    public void add(Colleague media) {
        this.medias.add(media);
    }

    @Override
    public void delete(Colleague media) {
        this.medias.remove(media);
    }

    @Override
    public void sendContents(String message, Colleague media) {
        for (Colleague containedMedia : this.medias) {
            if (!containedMedia.equals(media)) {
                containedMedia.receive(message);
            }
        }
    }
}
