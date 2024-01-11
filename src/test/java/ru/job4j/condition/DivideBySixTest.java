package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DivideBySixTest {
    @Test
    void whenNumberDivideBy6() {
        int input = 24;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number divides by 6.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberDivideBy3AndNotEven() {
        int input = 9;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number divides by 3, but it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberNoDivideBy3AndEven() {
        int input = 14;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number doesn't divide by 3, but it is the even number.";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNumberNoDivideBy3AndNotEven() {
        int input = 25;
        String result = DivideBySix.checkNumber(input);
        String expected = "The number doesn't divide by 3 and it isn't the even number.";
        assertThat(result).isEqualTo(expected);
    }
}