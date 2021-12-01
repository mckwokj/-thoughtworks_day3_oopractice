package com.afs.oopractice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Car", 30);
        Truck truck = new Truck("Truck", 10);
//        car.speedUp();
//        truck.speedUp();

        Driver driver1 = new Driver(new Car("Car", 30));
        Driver driver2 = new Driver(new Truck("Truck", 10));

        driver1.speedUp();
        driver2.speedUp();
    }
}
