package com.afs.oopractice;

public class Vehicle {
    private String name;
    private double speed;

    public Vehicle(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }

    public void speedUp() {
        System.out.println(name + ": speed up " + speed + " km/h");
    }
}
