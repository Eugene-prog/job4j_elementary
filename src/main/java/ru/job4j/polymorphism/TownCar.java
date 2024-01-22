package ru.job4j.polymorphism;

public class TownCar implements Vehicle {
    @Override
    public void changeGear() {
        System.out.println("Механическая коробка передач. Включить первую, дальше переключать до шестой");
    }

    @Override
    public void accelerate() {
        System.out.println("Нажатие на педаль газа механически открывает дроссельную заслонку");
    }

    @Override
    public void steer() {
        System.out.println("Стандартное рулевое управление");
    }

    @Override
    public void brake() {
        System.out.println("Стандартная тормозная система");
    }
}
