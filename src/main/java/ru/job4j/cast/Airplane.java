package ru.job4j.cast;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летит по воздуху");
    }

    @Override
    public void passengerCapacity() {
        System.out.println("Самолет вмещает 200 пассажиров");
    }
}
