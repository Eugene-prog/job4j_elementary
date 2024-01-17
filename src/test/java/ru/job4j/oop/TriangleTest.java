package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {
    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 8;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00and06and38Then9() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 6);
        Point c = new Point(3, 8);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = 9;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when00and00and11ThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(1, 1);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        double expected = -1;
        assertThat(result).isCloseTo(expected, offset(0.001));
    }
}