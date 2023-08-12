//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String input)
    {
        // code here
        int [] charCount = new int[26];
        Queue<Character> q = new LinkedList<>();
        StringBuilder result = new StringBuilder();
        
        for(char c : input.toCharArray()) {
            
            charCount[c-'a']++;
            q.offer(c);
            
            while(!q.isEmpty() && charCount[q.peek() - 'a'] >1) {
                q.poll();
            }
            
            if(q.isEmpty()) {
                result.append('#');
            } else {
                result.append(q.peek());
            }
        }
        
        return result.toString();
        
    }
}