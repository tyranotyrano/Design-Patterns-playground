package com.tyranotyrano.behavioral.iterator.iterator;

import java.util.Iterator;

import com.tyranotyrano.behavioral.iterator.aggregate.ParkingLot;
import com.tyranotyrano.behavioral.iterator.domain.Car;

public class ParkingLotIterator implements Iterator<Car> {
    private ParkingLot parkingLot;
    private int currentIndex = 0;

    public ParkingLotIterator(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < parkingLot.getLength();
    }

    @Override
    public Car next() {
        Car car = parkingLot.getCar(currentIndex);
        currentIndex++;
        return car;
    }
}
