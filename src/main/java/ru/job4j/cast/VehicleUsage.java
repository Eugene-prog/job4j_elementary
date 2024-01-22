package ru.job4j.cast;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle airplane = new Airplane();

        Vehicle[] vehicles = new Vehicle[]{train, bus, airplane};
        for (Vehicle object: vehicles) {
            object.move();
            object.passengerCapacity();
        }
    }
}
