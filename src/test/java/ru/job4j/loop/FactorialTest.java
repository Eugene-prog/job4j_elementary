package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {
    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int output = Factorial.calculate(5);
        assertThat(output).isEqualTo(120);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int output = Factorial.calculate(0);
        assertThat(output).isEqualTo(1);
    }

    @Test
    void calculateFactorialOfOne() {
        int result = Factorial.calculate(1);
        assertThat(result).isEqualTo(1);
    }

    @Test
    void calculateFactorialOfNegativeNumber() {
        int result = Factorial.calculate(-5);
        assertThat(result).isEqualTo(1);
    }
}