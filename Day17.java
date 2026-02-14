// GFG160 Day17 Problem: Add Binary Strings

public class Day17 {
    public String addBinary(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int carry = 0;
        
        StringBuilder result = new StringBuilder();
        
        while(i >= 0 || j >= 0 || carry != 0) {
            int bit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int bit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;
            
            int sum = bit1 + bit2 + carry;
            
            result.append(sum % 2);
            carry = sum / 2;
            
            i--;
            j--;
        }
        
        result.reverse();
        
        int idx = 0;
        
        while(idx < result.length() - 1 && result.charAt(idx) == '0') {
            idx++;
        }
        
        return result.substring(idx);
    }

    public static void main(String[] args) { 
        Day17 day17 = new Day17();
         
        String s1 = "1010"; 
        String s2 = "1011"; 
        String result = day17.addBinary(s1, s2); 
        
        System.out.println(result);
    }
}
