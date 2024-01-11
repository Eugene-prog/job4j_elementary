package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class LogicNotTest {
    @Test
    void whenIsEvenTrue() {
        int num = 2;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsEvenFalse() {
        int num = 3;
        boolean result = LogicNot.isEven(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenIsPositiveTrue() {
        int num = 2;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenIsPositiveFalse() {
        int num = -2;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumIs0IsPositiveFalse() {
        int num = 0;
        boolean result = LogicNot.isPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenFalse() {
        int num = 2;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenTrue() {
        int num = 3;
        boolean result = LogicNot.notEven(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotPositiveTrue() {
        int num = -2;
        boolean result = LogicNot.notPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotPositiveFalse() {
        int num = 2;
        boolean result = LogicNot.notPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumIs0NotPositiveFalse() {
        int num = 0;
        boolean result = LogicNot.notPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsTrue() {
        int num = 3;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotEvenFalseIsAllFalse() {
        int num = 2;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenPositiveFalseIsAllFalse() {
        int num = -3;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotEvenAndPositiveIsFalse() {
        int num = 0;
        boolean result = LogicNot.notEvenAndPositive(num);
        assertThat(result).isFalse();
    }

    @Test
    void whenEvenOrNotPositiveIsTrue() {
        int num = -2;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenIsTrueThenAllIsTrue() {
        int num = 2;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotPositiveIsTrueThenAllIsTrue() {
        int num = -3;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertThat(result).isTrue();
    }

    @Test
    void whenEvenOrNotPositiveIsFalse() {
        int num = 3;
        boolean result = LogicNot.evenOrNotPositive(num);
        assertThat(result).isFalse();
    }
}