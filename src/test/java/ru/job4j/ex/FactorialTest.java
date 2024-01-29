package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    public void whenFactorial12Then479001600() {
        short input = 12;
        double expected = 479001600.00;
        double output = Factorial.calc(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    public void whenExceptionFactorialTest() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Factorial.calc(-1));
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }
}