package org.muzychuk.boris.recursion;

import java.util.List;

public class MaxElement {

    public Integer max(List<Integer> nums) {
        if (nums.isEmpty()) {
            throw new IllegalArgumentException("List nums is empty");
        }
        int max = 0;
        if (nums.size() == 1) {
            return nums.getFirst();
        } else {
            Integer head = max(List.of(nums.getFirst()));
            Integer tail = max(nums.subList(1, nums.size()));
            return head > tail ? head : tail;
        }
    }

}
