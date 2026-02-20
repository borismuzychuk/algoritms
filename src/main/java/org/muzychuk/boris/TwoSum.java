package org.muzychuk.boris;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currNum = nums[i];
            int diff = target - currNum;
            if (intMap.get(diff) != null) {
                return new int[]{intMap.get(diff), i};
            }
            intMap.put(nums[i], i);
        }
        return new int[]{0, 0};
    }

}
