package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MatrixTest {
    @Test
    public void when2on2() {
        int size = 2;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void when3on3() {
        int size = 3;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 9},
        };
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void when5on5() {
        int size = 5;
        int[][] result = Matrix.multiple(size);
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        assertThat(result).isDeepEqualTo(expected);
    }
}