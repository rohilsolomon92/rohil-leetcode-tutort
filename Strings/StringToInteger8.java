public class StringToInteger8 {
    
}

class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        while(i<n && s.charAt(i) == ' '){
            i++;
        }

        if(i == n){
            return 0;
        }

        // check sign
        int sign = 1;
        if(s.charAt(i) == '-' || s.charAt(i) == '+'){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            i++;
        }

        int result = 0;

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            // check overflow
            if(result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10 ) ){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;

        }

        return result * sign;
        
    }
}
