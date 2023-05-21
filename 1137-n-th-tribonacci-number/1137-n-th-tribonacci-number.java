class Solution {
    public int tribonacci(int n) {
        
        int result = trib(n, new int [n+1]);
        
        return result;
    }
    
    public int trib(int n , int dp[]){
        
        if( n==0 || n==1){
            return n;
        }
        
        if(n == 2){
            return 1;
        }
        
        if(dp[n]> 0){
            return dp[n];
        }
        
        int total  = trib(n-1,dp)+ trib(n-2,dp)+ trib(n-3,dp);
        dp[n] = total;
        
        return total;
    }
}