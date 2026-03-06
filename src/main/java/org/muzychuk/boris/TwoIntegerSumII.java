package org.muzychuk.boris;

public class TwoIntegerSumII {

    public int[] twoSum(int[] numbers, int target) {
        int startPointer = 0;
        int endPointer = numbers.length - 1;
        while (startPointer < endPointer) {
            if (numbers[startPointer] + numbers[endPointer] > target) {
                endPointer--;
            } else if (numbers[startPointer] + numbers[endPointer] < target) {
                startPointer++;
            } else {
                return new int[]{startPointer + 1, endPointer + 1};
            }
        }
        return new int[]{-1, -1};
    }

}
