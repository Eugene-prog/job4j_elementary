package ru.job4j.polymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle townCar = new TownCar();
        townCar.changeGear();
        townCar.accelerate();
        townCar.steer();
        townCar.brake();
        Vehicle sportCar = new SportCar();
        Fuel fuel = (Fuel) sportCar;
        Vehicle vehicle = sportCar;
        sportCar.changeGear();
        sportCar.accelerate();
        sportCar.steer();
        sportCar.brake();
        fuel.refill();
    }
}
