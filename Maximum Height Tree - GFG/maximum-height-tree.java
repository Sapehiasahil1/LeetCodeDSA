//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.height(N));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int height(int N){
        // code here

        if(N<0)
        return 0;
        
        int i=1;
        int level =0;
        
        while(N>=0) {
            
            N=N-i;
            if(N <0)
            break;
            
            level++;
            i++;
            
        }
        return level;
    }
}