class Solution {
    public int uniquePaths(int m, int n) {
        
        int mat[][] = new int [m][n];
           
        return fun(mat, 0,0,m,n);
       
    }
    
    public int fun(int mat[][], int i, int j,  int m, int n) {
        
        if(i == m-1 || j == n-1) {
            
            return 1;
        }
        
        if(mat[i][j] != 0) {
            
        return mat[i][j];
            
        }
        
        int paths = fun(mat, i+1, j, m, n) + fun(mat, i, j+1, m, n);    
        
        mat[i][j] = paths;
        
        return paths;
    }
}