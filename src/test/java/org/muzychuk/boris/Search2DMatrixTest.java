package org.muzychuk.boris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Search2DMatrixTest {

    @Test
    void searchMatrix() {
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        boolean result = search2DMatrix.searchMatrix(new int[][]{
                { 1,  2,  4,  8},
                {10, 11, 12, 13},
                {14, 20, 30, 40}
        }, 10);
        assertTrue(result);

        result = search2DMatrix.searchMatrix(new int[][]{
                { 1,  2,  4,  8},
                {10, 11, 12, 13},
                {14, 20, 30, 40}
        }, 15);
        assertFalse(result);
    }
}