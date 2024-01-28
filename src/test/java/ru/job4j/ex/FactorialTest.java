package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    public void whenExceptionFactorialTest() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> Factorial.calc(-1));
        assertThat(exception.getMessage()).isEqualTo("Number could not be less than 0");
    }
}