package com.tyranotyrano.creational.abstractfactory.domain;

import com.tyranotyrano.creational.abstractfactory.product.Door;
import com.tyranotyrano.creational.abstractfactory.product.Room;

public class House {
    private Door door;
    private Room room;

    public House(Door door, Room room) {
        this.door = door;
        this.room = room;
    }

    public Door getDoor() {
        return door;
    }

    public Room getRoom() {
        return room;
    }

    public String getHouseInfo() {
        return "Door -> " + door.getBrand() + " : " + door.getType()
               + ", Room Size : " + room.getSize() + "평" + ", Room Window Counts : " + room.getWindowCounts() + "개";
    }
}
