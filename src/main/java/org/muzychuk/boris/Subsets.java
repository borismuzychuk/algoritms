package org.muzychuk.boris;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public List<List<Integer>> subsets_(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int sizeResult = result.size();
            for (int j = 0; j < sizeResult; j++) {
                List<Integer> subset = new ArrayList<>(result.get(j));
                subset.add(nums[i]);
                result.add(subset);
            }
        }
        return result;
    }

}
