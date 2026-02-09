// GFG160 Day11 Problem: Minimize the Heights II

import java.util.Arrays;

public class Day11 {
    public int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        
        if(n == 1) return 0;
        
        Arrays.sort(arr);
        
        int sum = arr[n-1] - arr[0];

        for(int i = 1; i < n; i++) {
            if(arr[i]-k < 0) continue;
            
            int minSum = Math.min(arr[0] + k, arr[i] - k);
            int maxSum = Math.max(arr[i-1] + k, arr[n-1] - k);
            
            sum = Math.min(sum, maxSum - minSum);
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Day11 day11 = new Day11();
        int[] arr = {1, 5, 8, 10};
        int k = 2;
        System.out.println(day11.getMinDiff(arr, k)); // Output: 5
    }
}
