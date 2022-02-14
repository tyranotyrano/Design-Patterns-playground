package com.tyranotyrano.behavioral.iterator.aggregate;

import java.util.Iterator;

import com.tyranotyrano.behavioral.iterator.domain.Car;

public interface Aggregate {
    Iterator<Car> iterator();
}
