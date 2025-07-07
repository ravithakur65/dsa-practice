package dsa.practice.array;

import java.util.Arrays;
import java.util.List;

public class MaxSumSubArray {
    public static void main(String[] args) {
        List<Integer> numbs = Arrays.asList(2,3,4,5,8,9,23,4,6,44,87,4,3,56,67,2,3,4);
        int k =3;
        MaxSumSubArray obj = new MaxSumSubArray();
        System.out.println("Max Sum of a sub array: "+obj.findMaxSum(numbs, k));
    }

    private int findMaxSum(List<Integer> nums, int k){
        int maxSum = 0,currentSum = 0;
        int i=0;
        while (i < k){
            maxSum += nums.get(i++);
        }
        System.out.println(maxSum);
        for(int j= k; j< nums.size(); j++){
            currentSum = maxSum - nums.get(j-k) + nums.get(j);
            maxSum = Math.max(maxSum, currentSum);
            System.out.println(currentSum);
        }
        return maxSum;
    }
}
