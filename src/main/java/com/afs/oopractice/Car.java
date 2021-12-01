package com.afs.oopractice;

public class Car extends Vehicle {

    public Car(String name, Engine engine) {
        super(name, engine.getSpeed());
    }

    public void speedUp() {
        System.out.println(getName() + ": speed up " + getSpeed() + " km/h");
    }
}
