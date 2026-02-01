// GFG160 Day2 Problem: Move All Zeros to End

class Day4 {
    void pushZerosToEnd(int[] arr) {
        int pos = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                
                pos++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        Day4 day4 = new Day4();

        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        day4.pushZerosToEnd(arr);
    }
}