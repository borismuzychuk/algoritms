package org.muzychuk.boris;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] line : matrix) {
            if (binarySearch(line, target) != -1) {
                return true;
            }
        }
        return false;
    }

    private int binarySearch(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (numbers[mid] == target) {
                return mid;
            }
            if (target < numbers[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
