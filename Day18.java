// GFG160 Day18 Problem: Anagram

public class Day18 {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }
        
        int[] freq = new int[26];
        
        for(int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++; 
            freq[s2.charAt(i) - 'a']--; 
        }
        
        for(int count : freq) {
            if(count != 0) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        
        System.out.println(areAnagrams(s1, s2)); // Output: true
        
        String s3 = "hello";
        String s4 = "world";
        
        System.out.println(areAnagrams(s3, s4)); // Output: false
    }
}
