// GFG160 Day19 Problem: Non Repeating Character

class Day19 {
    public char nonRepeatingChar(String s) {
        int[] freq = new int[26];
        
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return s.charAt(i);
            }
        }
        
        return '$';
    }

    public static void main(String[] args) {
        Day19 day19 = new Day19();
        
        String s1 = "hello";
        System.out.println(day19.nonRepeatingChar(s1)); // Output: 'h'
        
        String s2 = "aabbcc";
        System.out.println(day19.nonRepeatingChar(s2)); // Output: '$'
    }
}