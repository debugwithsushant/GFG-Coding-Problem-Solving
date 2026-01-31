// GFG160 Day1 Problem: Second Largest Element in an Array

class Day3{
        public int getSecondLargest(int[] arr) {

        int max = -1;
        int secMax = -1;

        for (int num : arr){
            if (num > max){
                secMax = max;
                max = num;
            } else if (num > secMax && num < max){
                secMax = num;
            }
        }
        return secMax;
    }

    public static void main(String[] args){
        Day3 day3 = new Day3();
        int[] arr = {1, 1, 1, 1};
        System.out.println(day3.getSecondLargest(arr));
    }
}