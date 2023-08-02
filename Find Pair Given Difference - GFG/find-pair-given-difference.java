//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();
            
            int arr[] =  new int[l];
            
            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();
            
            Solution ob = new Solution();
                
            if(ob.findPair(arr, l, n)==true)
                System.out.println(1);
                
            else
                System.out.println(-1);    
                
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr);
        
        int majElem = arr[size-1];
        
        for(int i=0; i<size; i++) {
            
            int num = arr[i];
            int find = num+n;
            
            if(find > majElem)
            continue;
            
            int start = i+1;
            int end = size-1;
            
            while(start <=end) {
                
                int mid = start + (end-start)/2;
                
                if(arr[mid] == find)
                return true;
                
                if(arr[mid] > find)
                end = mid-1;
                
                if(arr[mid] < find)
                start = mid+1;
            }
        }
        
        return false;
    }
}