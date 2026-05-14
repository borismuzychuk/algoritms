package org.muzychuk.boris.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecursionSumTest {

    @Test
    void sum() {

        Sum sum = new Sum();
        assertEquals(18, sum.sum(List.of(2, 4, 5, 6, 1)));

    }
}