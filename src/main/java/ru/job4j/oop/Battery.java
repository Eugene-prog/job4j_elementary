package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(70);
        Battery second = new Battery(30);
        System.out.println("First." + first.about());
        System.out.println("Second." + second.about());
        second.exchange(first);
        System.out.println("First." + first.about());
        System.out.println("Second." + second.about());
    }
}
