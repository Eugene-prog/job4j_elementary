package ru.job4j.calculator;

public class Fit {
    private static final double MAN_WEIGHT_COEFFICIENT = 1.15;
    private static final double WOMAN_WEIGHT_COEFFICIENT = 1.15;
    private static final int MAN_HEIGHT_DIFFERENCE = 100;
    private static final int WOMAN_HEIGHT_DIFFERENCE = 110;

    public static double calculateWeight(short height, int heightDifference, double weightCoefficient) {
        return Math.round((height - heightDifference) * weightCoefficient * 100.0 / 100.0);
    }

    public static double manWeight(short height) {
        return calculateWeight(height, MAN_HEIGHT_DIFFERENCE, MAN_WEIGHT_COEFFICIENT);
    }

    public static double womanWeight(short height) {
        return calculateWeight(height, WOMAN_HEIGHT_DIFFERENCE, WOMAN_WEIGHT_COEFFICIENT);
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 168;
        double man = Fit.manWeight(heightMan);
        double woman = Fit.womanWeight(heightWoman);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 168 is " + woman);
    }
}
