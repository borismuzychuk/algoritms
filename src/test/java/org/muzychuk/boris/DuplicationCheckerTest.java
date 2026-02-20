package org.muzychuk.boris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicationCheckerTest {

    @Test
    void hasDuplicate() {
        DuplicationChecker duplicationChecker = new DuplicationChecker();
        boolean result = duplicationChecker.hasDuplicate(new int[]{1, 2, 3, 3});
        assertTrue(result);

        result = duplicationChecker.hasDuplicate(new int[]{1, 2, 3, 4});
        assertFalse(result);
    }
}