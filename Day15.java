// GFG160 Day15 Problem: Smallest Positive Missing

import java.util.Arrays;

public class Day15 {
    public int missingNumber(int[] arr) {
        int missingNum = 1;
        
        Arrays.sort(arr);
        
        for(int i = 0; i < arr.length; i++) {
            if(missingNum == arr[i]) {
                missingNum++;
            }
        }
        
        return missingNum;
    }

    public static void main(String[] args) { 
        Day15 day15 = new Day15();
         
        int[] arr = {0, -10, 1, 3, -20}; 
        int result = day15.missingNumber(arr); 
        
        System.out.println(result); }
}
