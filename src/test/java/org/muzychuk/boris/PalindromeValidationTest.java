package org.muzychuk.boris;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeValidationTest {

    @Test
    void isPalindrome() {
        PalindromeValidation palindromeValidator = new PalindromeValidation();
        boolean result = palindromeValidator.isPalindrome("Was it a car or a cat I saw?");
        assertTrue(result);

        result = palindromeValidator.isPalindrome("tab a cat");
        assertFalse(result);
    }
}