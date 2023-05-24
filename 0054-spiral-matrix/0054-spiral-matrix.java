class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     
        int m = matrix.length;
        int n = matrix[0].length;
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int row_start=0;
        int row_end = m-1;
        
        int col_start = 0;
        int col_end = n-1;
        
        while(row_start <= row_end && col_start <=col_end){
            
            for(int i = col_start; i<=col_end; i++){
                
                result.add(matrix[row_start][i]);
            }
            row_start++;
            
            for(int j = row_start; j<=row_end; j++){
                result.add(matrix[j][col_end]);
            }
            col_end--;
            
            if(row_start <=row_end){
                for(int k = col_end; k>=col_start; k--){
                    result.add(matrix[row_end][k]);
                }
                row_end--;
            }
                    
            if(col_start<=col_end){
                for(int i = row_end; i>=row_start;i--){
                    result.add(matrix[i][col_start]);
                }
                col_start++;
            }
        }
        
        return result;
    }
}