package com.afs.oopractice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car", 30);
        Truck truck = new Truck("Truck", 10);
        car.speedUp();
        truck.speedUp();
    }
}
