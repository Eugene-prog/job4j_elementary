package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                return i;
            }
        }
        throw new ElementNotFoundException();
    }

    public static void main(String[] args) {
        String[] names = {"Mike", "Thomas", "Ben", "Eugene"};
        String searchName = "Jime";
        try {
            indexOf(names, searchName);
        } catch (ElementNotFoundException e) {
            System.out.println("Элемент не найден в массиве");
        }

    }
}
