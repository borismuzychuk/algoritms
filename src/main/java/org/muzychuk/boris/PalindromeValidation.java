package org.muzychuk.boris;

public class PalindromeValidation {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && isNotAlphanumeric(s.charAt(left))) {
                left++;
            }
            while (right > left && isNotAlphanumeric(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isNotAlphanumeric(int ch) {
        return ('A' > ch || ch > 'Z')
                && ('a' > ch || ch > 'z')
                && ('0' > ch || ch > '9');
    }

}
