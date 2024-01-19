package ru.job4j.oop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        Max maximum = new Max();
        int one = 1;
        int two = 2;
        int result = maximum.max(one, two);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then3() {
        Max maximum = new Max();
        int one = 1;
        int two = 2;
        int three = 3;
        int result = maximum.max(one, two, three);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To5Then5() {
        Max maximum = new Max();
        int one = 1;
        int two = 2;
        int three = 3;
        int four = 5;
        int result = maximum.max(one, two, three, four);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1To1To1Then1() {
        Max maximum = new Max();
        int one = 1;
        int two = 1;
        int three = 1;
        int four = 1;
        int result = maximum.max(one, two, three, four);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

}