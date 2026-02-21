package org.muzychuk.boris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesValidationTest {

    @Test
    void isValid() {
        ParenthesesValidation parenthesesValidator = new ParenthesesValidation();
        boolean result = parenthesesValidator.isValid("[]");
        assertTrue(result);

        result = parenthesesValidator.isValid("([{}])");
        assertTrue(result);

        result = parenthesesValidator.isValid("[(])");
        assertFalse(result);
    }
}