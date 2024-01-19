package ru.job4j.oop;

public class Max {
    public int max(int one, int two) {
        return one > two ? one : two;
    }

    public int max(int one, int two, int three) {
        return max(one, two) > three ? max(one, two) : three;
    }

    public int max(int one, int two, int three, int four) {
        return max(one, two) > max(three, four) ? max(one, two) : max(three, four);
    }
}
