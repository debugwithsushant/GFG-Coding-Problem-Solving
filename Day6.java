// GFG160 Day4 Problem: Rotate an Array

public class Day6 {
    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void rotateArr(int[] arr, int d) {
        int n = arr.length;
        d = d % n; // In case d > n
        reverse(arr, 0, d - 1); // Reverse first d elements
        reverse(arr, d, n - 1); // Reverse remaining n-d elements
        reverse(arr, 0, n - 1); // Reverse the whole array
    }

    public static void main(String[] args) {
        Day6 day6 = new Day6();

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 3;

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        day6.rotateArr(arr, d);

        System.out.println("\nRotated array by " + d + " positions:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
