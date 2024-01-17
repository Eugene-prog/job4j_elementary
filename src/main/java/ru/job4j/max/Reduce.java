package ru.job4j.max;

public class Reduce {
    private int[] numbers;

    public void to(int[] array) {
        numbers = array;
    }

    public void print() {
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}
