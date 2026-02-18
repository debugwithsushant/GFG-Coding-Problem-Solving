// GFG160 Day20 Problem: Search Pattern

import java.util.ArrayList;

public class Day20 {
    ArrayList<Integer> search(String pat, String txt) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] lps = buildLPS(pat);
        
        int i = 0;
        int j = 0;
        
        while(i < txt.length()) {
            if(txt.charAt(i) == pat.charAt(j)) {
                i++;
                j++;
            }
            
            if(j == pat.length()) {
                result.add(i - j);
                j = lps[j - 1];
            } else if(i < txt.length() && txt.charAt(i) != pat.charAt(j)) {
                if(j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        
        return result;
    }
    
    private int[] buildLPS(String pat) {
        int m = pat.length();
        int[] lps = new int[m];
        
        int len = 0;
        int i = 1;
        
        while(i < m) {
            if(pat.charAt(i) == pat.charAt(len)) {
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
        Day20 day20 = new Day20();
        
        String txt = "ababcababc";
        String pat = "abc";
        
        ArrayList<Integer> occurrences = day20.search(pat, txt);
        System.out.println(occurrences); // Output: [2, 7]
    }
}
