package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to22then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when12to1010then12dot041() {
        double expected = 12.041;
        Point a = new Point(1, 2);
        Point b = new Point(10, 10);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenminus1ninus2to11then3dot6() {
        double expected = 3.6;
        Point a = new Point(-1, -2);
        Point b = new Point(1, 1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}