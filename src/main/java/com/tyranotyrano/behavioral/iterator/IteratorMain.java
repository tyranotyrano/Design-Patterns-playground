package com.tyranotyrano.behavioral.iterator;

import java.util.Iterator;

import com.tyranotyrano.behavioral.iterator.aggregate.ParkingLot;
import com.tyranotyrano.behavioral.iterator.domain.Car;

public class IteratorMain {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(3);
        parkingLot.add(Car.of("벤츠", 1000));
        parkingLot.add(Car.of("아우디", 2000));
        parkingLot.add(Car.of("BMW", 3000));

        System.out.println("현재 주차장에 있는 차 개수 : " + parkingLot.getLength());
        System.out.println();

        Iterator<Car> iterator = parkingLot.iterator();
        while (iterator.hasNext()) {
            Car findCar = iterator.next();
            System.out.println(findCar.getInfo());
        }
    }
}
