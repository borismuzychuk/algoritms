package org.muzychuk.boris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramValidationTest {

    @Test
    void isAnagram() {
        AnagramValidation anagramValidator = new AnagramValidation();
        boolean result = anagramValidator.isAnagram("racecar", "carrace");
        assertTrue(result);

        result = anagramValidator.isAnagram("jar", "jam");
        assertFalse(result);
    }
}