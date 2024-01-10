package ru.job4j.calculator;

import static ru.job4j.calculator.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double sumAndDivision(double first, double second) {
        return sum(first, second) + division(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double allMethodsSum(double first, double second) {
        return difference(first, second) + division(first, second)
                + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен sumAndMultiply: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен differenceAndDivision: " + differenceAndDivision(10, 20));
        System.out.println("Результат расчета равен allMethodsSum: " + differenceAndDivision(10, 20));
    }
}
