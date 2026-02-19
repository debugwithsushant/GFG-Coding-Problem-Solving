// GFG160 Day22 Problem: Strings Rotations of Each Other

public class Day22 {
    public boolean areRotations(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        
        String combined = s1 + s1;
        
        return kmpSearch(combined, s2);
    }
    
    private boolean kmpSearch(String text, String pattern) {
        int[] lps = buildLps(pattern);
        
        int i = 0;
        int j = 0;
        
        while(i < text.length()) {
            if(text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            
            if(j == pattern.length()) {
                return true;
            } else if(i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if(j != 0) {
                    j = lps[j-1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }
    
    private int[] buildLps(String pat) {
        int n = pat.length();
        int[] lps = new int[n];
        
        int len = 0;
        int i = 1;
        
        while(i < n) {
            if(pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if(len != 0) {
                    len = lps[len-1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void main(String[] args) {
        Day22 day22 = new Day22();
        
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(day22.areRotations(s1, s2)); // Output: true
        
        String s3 = "ABCD";
        String s4 = "ACBD";
        System.out.println(day22.areRotations(s3, s4)); // Output: false
    }
}