package com.tyranotyrano.creational.abstractfactory.factory;

import com.tyranotyrano.creational.abstractfactory.product.Door;
import com.tyranotyrano.creational.abstractfactory.product.Room;

public interface HouseFactory {

    Door createDoor();

    Room createRoom();
}
