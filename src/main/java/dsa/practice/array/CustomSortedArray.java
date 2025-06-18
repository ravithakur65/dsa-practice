package dsa.practice.array;

import java.util.*;

public class CustomSortedArray {
    public static int minimumSwaps(List<Integer> arr) {
        int left = 0;
        int right = arr.size() - 1;
        int swaps = 0;

        while (left < right) {
            // Move left to the next odd
            while (left < arr.size() && arr.get(left) % 2 == 0) {
                left++;
            }

            // Move right to the next even
            while (right >= 0 && arr.get(right) % 2 == 1) {
                right--;
            }

            // Swap if left is before right
            if (left < right) {
                swaps++;
                left++;
                right--;
            }
        }

        return swaps;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(13, 10, 21, 20);
        System.out.println("Minimum swaps: " + minimumSwaps(arr)); // Output: 1
    }
}
