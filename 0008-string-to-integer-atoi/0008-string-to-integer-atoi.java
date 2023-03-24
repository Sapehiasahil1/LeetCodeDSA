class Solution {
    public int myAtoi(String s) {
        
        boolean negative = false;
        int i=0, n = s.length(), x = 0;
        
        while(i<n && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        
        if(i<n && (s.charAt(i)== '+' || s.charAt(i) == '-')) {
            negative = s.charAt(i) == '-';
            i++;
        }
        
        while(i <n && Character.isDigit(s.charAt(i))) {
            
            int digit = s.charAt(i) -'0';
            
            if (x > (Integer.MAX_VALUE - digit) / 10) {
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
             x = x*10 + digit;
             i++;
        }
        
         return negative ? -x : x;    
    }
   
}