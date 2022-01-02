package com.tyranotyrano.creational.abstractfactory;

import com.tyranotyrano.creational.abstractfactory.domain.House;
import com.tyranotyrano.creational.abstractfactory.factory.HouseFactory;
import com.tyranotyrano.creational.abstractfactory.factory.OfficetelFactory;
import com.tyranotyrano.creational.abstractfactory.factory.OneRoomFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        System.out.println("1. One Room 생성 ========================");
        HouseFactory oneRoomFactory = new OneRoomFactory();
        House oneRoom = new House(oneRoomFactory.createDoor(), oneRoomFactory.createRoom());
        System.out.println(oneRoom.getHouseInfo());

        System.out.println();
        System.out.println("2. Officetel 생성 ========================");
        HouseFactory officetelFactory = new OfficetelFactory();
        House officetel = new House(officetelFactory.createDoor(), officetelFactory.createRoom());
        System.out.println(officetel.getHouseInfo());
    }
}
