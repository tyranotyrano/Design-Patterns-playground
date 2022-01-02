package com.tyranotyrano.creational.abstractfactory.factory;

import com.tyranotyrano.creational.abstractfactory.product.Door;
import com.tyranotyrano.creational.abstractfactory.product.ManualDoor;
import com.tyranotyrano.creational.abstractfactory.product.Room;
import com.tyranotyrano.creational.abstractfactory.product.SmallRoom;

public class OneRoomFactory implements HouseFactory {

    @Override
    public Door createDoor() {
        return new ManualDoor();
    }

    @Override
    public Room createRoom() {
        return new SmallRoom();
    }
}
