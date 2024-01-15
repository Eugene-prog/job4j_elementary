package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSortArray2() {
        int[] data = new int[]{4, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArray3() {
        int[] data = new int[]{3, 4, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 3, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArray5() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArray501() {
        int[] data = new int[]{0, 1, 0, 1, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 0, 0, 1, 1};
        assertThat(result).containsExactly(expected);
    }

}