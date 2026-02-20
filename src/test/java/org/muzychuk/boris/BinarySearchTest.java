package org.muzychuk.boris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void whenElementIsMiddlePosition_thenReturnFoundElement() {
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.search(new int[]{-1, 0, 2, 4, 6, 8}, 4);
        assertEquals(3, result);
    }

    @Test
    void whenElementIsAbsent_thenReturnOneMinus() {
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.search(new int[]{-1, 0, 2, 4, 6, 8}, 3);
        assertEquals(-1, result);
    }

    @Test
    void whenElementIsEndPosition_thenReturnFoundElement() {
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.search(new int[]{-2, -1, 0, 1, 2, 4, 6, 8}, 8);
        assertEquals(7, result);
    }

    @Test
    void whenElementIsStartPosition_thenReturnFoundElement() {
        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.search(new int[]{-2, -1, 0, 1, 2, 4, 6, 8}, -2);
        assertEquals(0, result);
    }
}