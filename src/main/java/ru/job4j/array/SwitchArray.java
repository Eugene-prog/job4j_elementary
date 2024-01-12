package ru.job4j.array;

public class SwitchArray {

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6};
        int[] result = swapBorder(numbers);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}