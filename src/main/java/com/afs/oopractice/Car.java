package com.afs.oopractice;

public class Car {
    private String name;
    private double speed;

    public Car(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        System.out.println(name + ": speed up " + speed + " km/h");
    }
}
