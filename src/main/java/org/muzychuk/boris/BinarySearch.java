package org.muzychuk.boris;

import java.util.List;
import java.util.Objects;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }

    public int searchRecursive(List<Integer> nums, Integer target) {
        return searchRecursive(nums, target, 0, nums.size() - 1);
    }

    public int searchRecursive(List<Integer> nums, Integer target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (Objects.equals(nums.get(mid), target)) {
            return mid;
        } else if (nums.get(mid) > target) {
            return searchRecursive(nums, target, left, mid - 1);
        } else {
            return searchRecursive(nums, target, mid + 1, right);
        }
    }

    public int searchRecursive(int[] nums, int target) {
        return searchRecursive(nums, target, 0, nums.length - 1);
    }

    private int searchRecursive(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return searchRecursive(nums, target, left, mid - 1);
        } else {
            return searchRecursive(nums, target, mid + 1, right);
        }
    }


}
