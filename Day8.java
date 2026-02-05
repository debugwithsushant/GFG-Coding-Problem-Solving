// GFG160 Day8 Problem: Majority Element- More than n/3

import java.util.ArrayList;
import java.util.Arrays;

public class Day8 {
    public ArrayList<Integer> findMajority(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count = 1;
        int prev = arr[0];
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i < n; i++) {
            if (arr[i] == prev) {
                count++;
            } else {
                if (count > n / 3) {
                    result.add(prev);
                }
                prev = arr[i];
                count = 1;
            }
        }

        if (n == 1) {
            result.add(arr[0]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Day8 day8 = new Day8();

        int[] arr = {3, 2, 3, 3, 1, 3, 2};
        System.out.println("Input array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        ArrayList<Integer> majorityElements = day8.findMajority(arr);
        System.out.println("\nMajority elements (more than n/3):");
        for (int num : majorityElements) {
            System.out.print(num + " ");
        }
    }
}