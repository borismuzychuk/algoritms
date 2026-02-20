package org.muzychuk.boris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void twoSum() {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(new int[]{3, 4, 5, 6}, 7);
        assertArrayEquals(new int[]{0, 1}, result);

        result = twoSum.twoSum(new int[]{4, 5, 6}, 10);
        assertArrayEquals(new int[]{0, 2}, result);

        result = twoSum.twoSum(new int[]{5, 5}, 10);
        assertArrayEquals(new int[]{0, 1}, result);
    }
}