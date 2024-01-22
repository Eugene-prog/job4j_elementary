package ru.job4j.polymorphism;

public class Bus implements Transport {
    private int passengerCount;
    private double priceFuel = 52.50;

    @Override
    public void go() {
        System.out.println("Автобус едет");
    }

    @Override
    public void addPassengers(int passengers) {
        if (passengers > 0) {
            System.out.println("Добавлено " + passengers + " пассажиров.");
            passengerCount += passengers;
        } else {
            System.out.println("Неправильное число пассажиров");
        }
    }

    @Override
    public double refuel(double litres) {
        return litres * priceFuel;
    }
}
