//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        // code here
        if(S == null || S.isEmpty()) {
            return "";
        }
        
        int start =0;
        int maxLength = 1;
        
        for(int i=0; i<S.length(); i++) {
            
            int odd = helperFun(S,i,i);
            int even = helperFun(S,i,i+1);
            
            int currentMaxLength = Math.max(odd, even);
            if (currentMaxLength > maxLength) {
                maxLength = currentMaxLength;
                start = i - (maxLength - 1) / 2;
            }
        }
        return S.substring(start,start+maxLength);
    }
    
    private static int helperFun(String input, int left, int right) {
        while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
            left--;
            right++;
        }
        // Return the length of the palindrome substring
        return right - left - 1;
    }
}