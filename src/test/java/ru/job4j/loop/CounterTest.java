package ru.job4j.loop;

import org.junit.jupiter.api.Test;
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
}