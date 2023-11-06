package com.itava0;

public class Car extends Vehicle {

    boolean openDoor;
    boolean closeDoor;

    public boolean isOpenDoor() {
       return this.openDoor = true;

    }

    public  boolean isCloseDoor() {
        return  this.closeDoor = false;
    }

}
