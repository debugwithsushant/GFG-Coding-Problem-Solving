// GFG160 Day14 Problem: Max Circular Subarray Sum

public class Day14 {
    public int maxCircularSum(int arr[]) {
        int totalSum = arr[0];
        
        int tempMin = arr[0];
        int finalMin = arr[0];
        
        int tempMax = arr[0];
        int finalMax = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            totalSum += arr[i];
            
            tempMax = Math.max(arr[i], tempMax + arr[i]);
            finalMax = Math.max(finalMax, tempMax);
            
            tempMin = Math.min(arr[i], tempMin + arr[i]);
            finalMin = Math.min(finalMin, tempMin);
        }
        
        if(finalMax < 0) {
            return finalMax;
        }
        
        return Math.max(finalMax, totalSum - finalMin);
    }

    public static void main(String[] args) {
        Day14 day14 = new Day14();

        int[] arr = {8, -8, 9, -9, 10, -11, 12};
        int result = day14.maxCircularSum(arr);
        System.out.println(result);
    }
}
