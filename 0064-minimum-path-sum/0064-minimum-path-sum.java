class Solution {
    public int minPathSum(int[][] grid) {
        
        int m = grid.length;
        int n = grid[0].length; 
        
        int dp[][] =new int [m][n];
        
        return helper(0,0, grid, dp, m, n);
    }
    
    public int helper(int i, int j, int grid[][], int dp[][], int m, int n){
        
        
        if(i == m-1 && j ==n-1){
            return grid[i][j];
        }
        
         if(i >= m || j >= n){
            return Integer.MAX_VALUE;
        }
        
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        
       
        int right = helper(i, j+1,grid,dp,m,n);
        int down = helper(i+1,j,grid,dp,m,n);
        
        int minSum = Math.min(right,down)+grid[i][j];
        
        dp[i][j] = minSum;
        
        return minSum;
        
    }
}