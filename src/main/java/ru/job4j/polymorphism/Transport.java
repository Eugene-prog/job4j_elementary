package ru.job4j.polymorphism;

public interface Transport {
    void go();

    void addPassengers(int passengers);

    double refuel(double litres);
}