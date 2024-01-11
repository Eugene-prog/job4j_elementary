package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    @Test
    public void testSumInRange() {
        assertEquals(55, Counter.sum(0, 10));
        assertEquals(33, Counter.sum(3, 8));
        assertEquals(1, Counter.sum(1, 1));
        assertEquals(0, Counter.sum(-5, 5));
    }

    @Test
    public void testSumWhenStartGreaterThanFinish() {
        assertEquals(0, Counter.sum(10, 0));
    }

    @Test
    public void testSumWhenStartEqualsFinish() {
        assertEquals(1, Counter.sum(1, 1));
    }

    @Test
    void sumByEvenWithNegativeStart() {
        int result = Counter.sumByEven(-5, 6);
        assertThat(result).isEqualTo(6);
    }

    @Test
    void sumByEvenWhenStartEqualsFinish() {
        int result = Counter.sumByEven(5, 5);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void sumByEvenInRange() {
        int result = Counter.sumByEven(0, 10);
        assertThat(result).isEqualTo(30);
    }

    @Test
    void sumByEvenWhenStartGreaterThanFinish() {
        int result = Counter.sumByEven(10, 0);
        assertThat(result).isEqualTo(0);
    }
}