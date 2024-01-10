package ru.job4j.calculator;

public class MathFunction {
    public static int func1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int func2(int x) {
        int y = 1 / x;
        return y;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double sum(double first, double second) {
        return first + second;
    }

    public static double division(double first, double second) {
        return first / second;
    }

    public static double difference(double first, double second) {
        return first - second;
    }

    public static void main(String[] args) {
        int result1 = MathFunction.func1(3);
        int result2 = MathFunction.func2(5);
        int result3 = MathFunction.func1(100);
        int total = result1 + result2;
        System.out.println(total);
    }
}
