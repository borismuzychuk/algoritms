package org.muzychuk.boris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NearbyDuplicationCheckerTest {

    @Test
    void containsNearbyDuplicate() {
        NearbyDuplicationChecker nearbyDuplicationChecker = new NearbyDuplicationChecker();
        boolean result = nearbyDuplicationChecker.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
        assertTrue(result);

        result = nearbyDuplicationChecker.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1);
        assertTrue(result);

        result = nearbyDuplicationChecker.containsNearbyDuplicate(new int[]{2, 1, 2}, 1);
        assertFalse(result);
    }
}