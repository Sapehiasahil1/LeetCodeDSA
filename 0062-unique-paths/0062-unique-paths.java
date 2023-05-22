class Solution {
    public int uniquePaths(int m, int n) {
        
        int matrix[][] = new int [m][n];
        
       return  pathFun(0,0,matrix,m,n);
    }
    
    public int  pathFun(int i, int j, int matrix[][], int m, int n){

       
        if(i == m-1 || j == n-1){
            return 1;
        }
        
        if(matrix[i][j] !=0){
            return matrix[i][j];
        }
        int right = pathFun(i,j+1,matrix,m,n);
        int down = pathFun(i+1,j,matrix,m,n);
        
        int totalWays = right+down;
        
        matrix[i][j] = totalWays;
        
        return totalWays;
    }
}