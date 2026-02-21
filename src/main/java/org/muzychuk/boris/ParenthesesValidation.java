package org.muzychuk.boris;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class ParenthesesValidation {

    public boolean isValid(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put('(', ')');
        brackets.put('[', ']');
        brackets.put('{', '}');
        Deque<Character> stack = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            if (isOpeningBracket(ch)) {
                stack.push(ch);
            } else {
                if (!stack.isEmpty() && ch == brackets.get(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpeningBracket(char ch) {
        return ch == '(' || ch == '[' || ch == '{';
    }

}
