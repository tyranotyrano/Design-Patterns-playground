package com.tyranotyrano.creational.abstractfactory.factory;

import com.tyranotyrano.creational.abstractfactory.product.AutoDoor;
import com.tyranotyrano.creational.abstractfactory.product.BigRoom;
import com.tyranotyrano.creational.abstractfactory.product.Door;
import com.tyranotyrano.creational.abstractfactory.product.Room;

public class OfficetelFactory implements HouseFactory {

    @Override
    public Door createDoor() {
        return new AutoDoor();
    }

    @Override
    public Room createRoom() {
        return new BigRoom();
    }
}
