class Solution {
    public int climbStairs(int n) {
        
        return fun(n, new int[n+1]);
    }
    
    public int fun(int n, int dp[]){
        
        if(n ==0 ){
            return 1;
        }
        
        if(n < 0){
            return 0;
        }
        
        if(dp[n] > 0){
            return dp[n];
        }
        
        int nm1 = fun(n-1,dp);
        int nm2 = fun(n-2,dp);
        
        int cp = nm1+nm2;
        
        dp[n] = cp;
        
        return cp;
        
        
    }
}