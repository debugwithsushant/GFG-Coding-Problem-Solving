// GFG160 Day16 Problem: Implement Atoi

public class Day16 {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        
        while(i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        int sign = 1;
        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if(s.charAt(i) == '-') {
                sign = -1;
            }
            
            i++;
        }
        
        long num = 0;
        
        while(i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            
            if(sign == 1 && num > 2147483647) {
                return 2147483647;
            }
            if(sign == -1 && -num < -2147483648) {
                return -2147483648;
            }
            
            i++;
        }
        
        return (int)(sign * num);
    }

    public static void main(String[] args) { 
        Day16 day16 = new Day16();
         
        String s = "   -42"; 
        int result = day16.myAtoi(s); 
        
        System.out.println(result);
    }
}
