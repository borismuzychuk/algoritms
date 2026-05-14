package org.muzychuk.boris.recursion;

import java.util.ArrayList;
import java.util.List;

public class ListQuicksort {

    public List<Integer> quicksort(List<Integer> nums) {
        if (nums.size() < 2) {
            return nums;
        } else {
            Integer pivot = nums.get(nums.size() / 2);
            List<Integer> less = new ArrayList<>();
            List<Integer> greater = new ArrayList<>();
            List<Integer> equal = new ArrayList<>();
            for (Integer num : nums) {
                if (num < pivot) {
                    less.add(num);
                } else if (num > pivot) {
                    greater.add(num);
                } else {
                    equal.add(num);
                }
            }
            List<Integer> result = new ArrayList<>(quicksort(less));
            result.addAll(equal);
            result.addAll(quicksort(greater));
            return result;
        }

    }

}
