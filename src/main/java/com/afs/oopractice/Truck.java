package com.afs.oopractice;

public class Truck extends Vehicle {
    public Truck(String name, double speed) {
        super(name, speed);
    }

    public void speedUp() {
        System.out.println(getName() + ": speed up " + getSpeed() + " km/h");
    }
}
