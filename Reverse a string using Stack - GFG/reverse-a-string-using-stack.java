//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String str){
        //code here
        StringBuilder ans = new StringBuilder();
        Stack<Character> s = new Stack<>();
        
        int n = str.length();
        
        for(int i=0; i<n; i++) {
            
            s.push(str.charAt(i));
        }
        
        while(!s.isEmpty()) {
            
            ans.append(s.pop());
        }
        
        return ans.toString();
    }

}