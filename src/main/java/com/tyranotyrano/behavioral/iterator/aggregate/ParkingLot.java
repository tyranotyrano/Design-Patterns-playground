package com.tyranotyrano.behavioral.iterator.aggregate;

import java.util.Iterator;

import com.tyranotyrano.behavioral.iterator.domain.Car;
import com.tyranotyrano.behavioral.iterator.iterator.ParkingLotIterator;

public class ParkingLot implements Aggregate {
    private final Car[] cars;
    int currentIndex = 0;

    public ParkingLot(int size) {
        this.cars = new Car[size];
        this.currentIndex = 0;
    }

    public void add(Car car) {
        if (currentIndex < cars.length) {
            this.cars[currentIndex] = car;
            this.currentIndex++;
            return;
        }

        System.out.println("주차장이 만석입니다. (총 " + cars.length + "대)");
    }

    public Car getCar(int index) {
        return cars[index];
    }

    public int getLength() {
        return currentIndex;
    }

    @Override
    public Iterator<Car> iterator() {
        return new ParkingLotIterator(this);
    }
}
