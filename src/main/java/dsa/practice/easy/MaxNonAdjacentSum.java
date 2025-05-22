package dsa.practice.easy;

public class MaxNonAdjacentSum {
    public static int findMaxNonAdjacentSum(int[] arr) {
        // Edge cases
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        if (arr.length == 1) {
            return arr[0];
        }

        // Initialize variables for DP
        int incl = arr[0]; // Max sum including the current element
        int excl = 0;      // Max sum excluding the current element

        // Iterate through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // Store the previous 'incl' value
            int temp = incl;
            // New 'incl' is the current element plus the previous 'excl'
            incl = arr[i] + excl;
            // New 'excl' is the maximum of the previous 'incl' and 'excl'
            excl = Math.max(temp, excl);
        }

        // Return the maximum of the final 'incl' and 'excl'
        return Math.max(incl, excl);
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {5, 5, 10, 100, 10, 5};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1};
        int[] arr4 = {-2, -3, -4};
        int[] arr5 = {5,3,4,6};

        System.out.println("Max non-adjacent sum for arr1: " + findMaxNonAdjacentSum(arr1)); // Output: 105
        System.out.println("Max non-adjacent sum for arr2: " + findMaxNonAdjacentSum(arr2)); // Output: 4
        System.out.println("Max non-adjacent sum for arr3: " + findMaxNonAdjacentSum(arr3)); // Output: 1
        System.out.println("Max non-adjacent sum for arr4: " + findMaxNonAdjacentSum(arr4)); // Output: -2
        System.out.println("Max non-adjacent sum for arr5: " + findMaxNonAdjacentSum(arr5)); // Output: -2
    }
}
