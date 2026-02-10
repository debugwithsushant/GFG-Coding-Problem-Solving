// GFG160 Day13 Problem: Maximum Product Subarray

public class Day13 {
    int maxProduct(int[] arr) {
        int minimumProduct = arr[0];
        int maximumProduct = arr[0];
        int ans = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            int ele = arr[i];
            
            if(ele < 0) {
                int temp = maximumProduct;
                maximumProduct = minimumProduct;
                minimumProduct = temp;
            }
            
            minimumProduct = Math.min(ele, minimumProduct * ele);
            maximumProduct = Math.max(ele, maximumProduct * ele);
            
            ans = Math.max(ans, maximumProduct);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Day13 solution = new Day13();
        int[] arr = {2,3,-2,4};
        int result = solution.maxProduct(arr);
        System.out.println("Maximum product subarray is: " + result);
    }
}
