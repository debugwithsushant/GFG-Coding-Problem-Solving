// GFG160 Day12 Problem: Kadane's Algorithm

public class Day12 {
    int maxSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        return maxSum;
    }

    public static void main(String[] args) {
        Day12 solution = new Day12();
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int result = solution.maxSubarraySum(arr);
        System.out.println("Maximum subarray sum is: " + result);
    }
}
