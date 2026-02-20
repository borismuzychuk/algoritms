package org.muzychuk.boris;

import java.util.*;

public class DuplicationChecker {

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>(Arrays.stream(nums)
                .boxed()
                .toList());
        return uniqueNums.size() != nums.length;
    }

}
