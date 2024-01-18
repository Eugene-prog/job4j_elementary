package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return a / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + divide(a) + multiply(a);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int multiplyResult = calculator.multiply(10);
        int minusResult = minus(3);
        int divideResult = calculator.divide(2);
        int sumResult = sum(4);
        int allOperationResult = calculator.sumAllOperation(5);
        System.out.println(allOperationResult);
    }
}