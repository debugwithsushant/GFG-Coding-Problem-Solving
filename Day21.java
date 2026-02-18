// GFG160 Day21 Problem: Min Chars to Add for Palindrome

public class Day21 {
    public int minChar(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String temp = s + "#" + rev;
        
        int[] lps = buildLps(temp);
        
        int longestPalPrefix = lps[lps.length - 1];
        
        return s.length() - longestPalPrefix;
    }
    
    private int[] buildLps(String str) {
        int n = str.length();
        int[] lps = new int[n];
        
        int len = 0;
        int i = 1;
        
        while(i < n) {
            if(str.charAt(i) == str.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        Day21 day21 = new Day21();
        
        String s1 = "abc";
        System.out.println(day21.minChar(s1)); // Output: 2
        
        String s2 = "aacecaaa";
        System.out.println(day21.minChar(s2)); // Output: 1
    }
}
