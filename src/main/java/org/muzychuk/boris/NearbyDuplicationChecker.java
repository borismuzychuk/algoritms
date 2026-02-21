package org.muzychuk.boris;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

/*
 * Contains Duplicate II
 * */
public class NearbyDuplicationChecker {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numsIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsIndexMap.containsKey(nums[i])) {
                if (abs(numsIndexMap.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            numsIndexMap.put(nums[i], i);
        }
        return false;
    }

}
