package org.muzychuk.boris.recursion;

import java.util.List;

public class Sum {

    public Integer sum(List<Integer> nums) {
        if (nums.isEmpty()) {
            return 0;
        } else if (nums.size() == 1) {
            return nums.getFirst();
        } else {
            return nums.getFirst() + sum(nums.subList(1, nums.size()));
        }
    }

}
