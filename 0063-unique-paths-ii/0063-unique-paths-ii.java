class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int n =obstacleGrid.length;
        int m = obstacleGrid[0].length;
        
        int dp[][]= new int [n][m];
        
        return helper(0,0,obstacleGrid,dp,n,m);
    }
    
    public int helper(int i, int j, int obstacleGrid[][], int dp[][], int n, int m){
        
        if(i == n-1 && j == m-1){
            
            if(obstacleGrid[i][j] ==1){
                return 0;
            } else {
                return 1;
            }
        }
        
        
        if(i >=n || j >=m || obstacleGrid[i][j] ==1){
            return 0;
        }
        if(dp[i][j] != 0){
            
            return dp[i][j];
        }
        int right = helper(i,j+1, obstacleGrid, dp, n,m);
        int down = helper(i+1, j, obstacleGrid,dp,n,m);
        
        int totalWays = right+down;
        
        dp[i][j] = totalWays;
        
        return totalWays;
    }
}