package dsa.practice.array;

public class MaxAverageSubArray {
    public static void main(String[] args) {
        int[] arr = {11, -8, 16, -7, 24, -2, 3};
        MaxAverageSubArray maxSum = new MaxAverageSubArray();
        System.out.println(maxSum.findMaxSum(arr, 3));
    }

    public int findMaxSum(int[] arr, int k){
        int preSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;
        for(int i=0; i< k;i++){
            preSum += arr[i];
        }
        int currSum;
        for(int i=k; i<arr.length;i++){
            currSum = preSum + arr[i] - arr[i-k];
            System.out.println("Current Sum :"+currSum);
            if(currSum > maxSum){
                startIndex = i-1;
                maxSum = currSum;
            }
            preSum = currSum;
        }
        System.out.println("Start Index of max sum :"+startIndex );

        return maxSum;
    }
}
