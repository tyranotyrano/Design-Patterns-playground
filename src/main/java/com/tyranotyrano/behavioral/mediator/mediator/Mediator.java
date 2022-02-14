package com.tyranotyrano.behavioral.mediator.mediator;

import com.tyranotyrano.behavioral.mediator.colleague.Colleague;

public interface Mediator {
    void add(Colleague media);
    void delete(Colleague media);
    void sendContents(String message, Colleague media);
}
