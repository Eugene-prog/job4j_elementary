package ru.job4j.cast;

public class Bus implements Vehicle {

    @Override
    public void move() {
        System.out.println("Автобус едет по трассе");
    }

    @Override
    public void passengerCapacity() {
        System.out.println("Автобус вмещает 56 пассажиров");
    }
}
