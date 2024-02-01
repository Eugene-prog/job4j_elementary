package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindTest {
    @Test
    void whenIndexIsNegative() {
        String[] data = {"one", "two", "three"};
        int index = -3;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Find.get(data, index);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("Index out of bound");
    }

    @Test
    void whenIndexIsGreaterThanArrayLength() {
        String[] data = {"one", "two", "three"};
        int index = 10;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Find.get(data, index);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("Index out of bound");
    }

    @Test
    void whenIndexEqualsArrayLength() {
        String[] data = {"one", "two", "three"};
        int index = 3;
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Find.get(data, index);
                }
        );
        assertThat(exception.getMessage()).isEqualTo("Index out of bound");
    }

    @Test
    void whenIndexIsCorrect() {
        String[] data = {"one", "two", "three"};
        int index = 1;
        String result = Find.get(data, index);
        String expected = "two";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIndexIs0ThenItIsCorrect() {
        String[] data = {"one", "two", "three"};
        int index = 0;
        String result = Find.get(data, index);
        String expected = "one";
        assertThat(result).isEqualTo(expected);
    }
}