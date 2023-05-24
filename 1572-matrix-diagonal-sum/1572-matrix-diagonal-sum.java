class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum =0;
        int n = mat.length;
        
        //primary diagonal        
        for(int i=0; i<n; i++){
            sum+= mat[i][i];
            mat[i][i] =-1;
        }
        
        //secondaryDiagonal
        int j=0;
        for(int i =n-1; i>=0; i--){
            
            if(mat[i][j] !=-1){
                sum+=mat[i][j];
            }
            j++;
        }
        
        return sum;
    }
}