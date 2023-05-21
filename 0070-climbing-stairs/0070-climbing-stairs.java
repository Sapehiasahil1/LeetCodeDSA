class Solution {
    public int climbStairs(int n) {
        
        int dp[] = new int[n+1];
        int result = climbStairsDp(n,dp);
        
        return result;
    }
    
    public int climbStairsDp(int n , int dp[]){
        
        if(n ==0){
            return 1;
        }
        if(n <0){
            return 0;
        }
        
        if(dp[n]>0){
            return dp[n];
        }
        int oneStep = climbStairsDp(n-1,dp);
        int twoStep = climbStairsDp(n-2,dp);
        
        int totalStep = oneStep +twoStep;
        dp[n] =totalStep;
        
        return totalStep;
    }
}