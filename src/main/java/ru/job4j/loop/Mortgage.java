package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
              amount += amount * percent * 0.01 - salary;
              year++;
        }
        return year;
    }
}