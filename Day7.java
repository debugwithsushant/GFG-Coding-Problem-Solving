// GFG160 Day7 Problem: Next Permutation

public class Day7 {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int breakPoint = -1;

        // Step 1: Find the rightmost pair of indices (i, i+1) where arr[i] < arr[i+1]
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                breakPoint = i;
                break;
            }
        }

        // If a breakPoint is found, find the rightmost element that is greater than arr[breakPoint] and swap them
        if (breakPoint != -1) {
            for (int j = n - 1; j > breakPoint; j--) {
                if (arr[j] > arr[breakPoint]) {
                    // Step 2: Swap arr[breakPoint] and arr[j]
                    int temp = arr[breakPoint];
                    arr[breakPoint] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
            reverse(arr, breakPoint + 1, n - 1); // Step 3: Reverse the subarray from breakPoint + 1 to end
        } else {
            reverse(arr, 0, n - 1); // If no breakPoint is found, reverse the entire array
        }
    }

    // Helper method to reverse a portion of the array
    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Day7 day7 = new Day7();

        int[] arr = {1, 2, 3};
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        day7.nextPermutation(arr);

        System.out.println("\nNext permutation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}