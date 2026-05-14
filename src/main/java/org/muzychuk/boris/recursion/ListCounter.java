package org.muzychuk.boris.recursion;

import java.util.List;

public class ListCounter {

    public int length(List<Integer> nums) {
        if (nums.isEmpty()) {
            return 0;
        } else if (nums.size() == 1) {
            return 1;
        } else {
            return length(List.of(nums.getFirst())) + length(nums.subList(1, nums.size()));
        }
    }

}
