package org.muzychuk.boris.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListCounterTest {

    @Test
    void length() {

        ListCounter listCounter = new ListCounter();
        assertEquals(8, listCounter.length(List.of(7, 9, 2, 4, 6, 5, 1, 0)));

    }
}