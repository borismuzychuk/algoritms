package org.muzychuk.boris.recursion;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListQuicksortTest {

    @Test
    void quicksort() {
        ListQuicksort listQuicksort = new ListQuicksort();
        assertEquals(List.of(-336, -5, 0, 6, 11, 22, 35, 42),
                listQuicksort.quicksort(List.of(11, 22, -336, 42, 35, 6, -5, 0)));
    }
}