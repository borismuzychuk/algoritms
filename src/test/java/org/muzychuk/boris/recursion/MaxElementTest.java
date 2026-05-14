package org.muzychuk.boris.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxElementTest {

    @Test
    void max() {

        MaxElement maxElement = new MaxElement();
        assertEquals(42, maxElement.max(List.of(-24, 8, 0, 42, 11, 12, 12, 17)));

    }
}