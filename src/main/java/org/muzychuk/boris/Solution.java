package org.muzychuk.boris;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> sortedSquares(List<Integer> nums) {
        int left = 0;
        int right = nums.size() - 1;
        List<Integer> result = new ArrayList<>(nums);
        int resultPosition = right  ;
        while (left <= right) {
            int leftInt = nums.get(left);
            int rightInt = nums.get(right);
            if (Math.abs(leftInt) < Math.abs(rightInt)) {
                result.set(resultPosition, rightInt * rightInt);
                right--;
            } else {
                result.set(resultPosition, leftInt * leftInt);
                left++;
            }
            resultPosition--;
        }
        return result;
    }

}
