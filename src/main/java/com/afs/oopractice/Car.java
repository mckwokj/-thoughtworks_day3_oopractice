package com.afs.oopractice;

public class Car extends Vehicle {

    public Car(String name, double speed) {
        super(name, speed);
    }

    public void speedUp() {
        System.out.println(getName() + ": speed up " + getSpeed() + " km/h");
    }
}
