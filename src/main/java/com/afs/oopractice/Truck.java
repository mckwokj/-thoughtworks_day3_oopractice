package com.afs.oopractice;

public class Truck {
    private String name;
    private double speed;

    public Truck(String name, double speed) {
        this.name = name;
        this.speed = speed;
    }

    public void speedUp() {
        System.out.println(name + ": speed up " + speed + " km/h");
    }
}
