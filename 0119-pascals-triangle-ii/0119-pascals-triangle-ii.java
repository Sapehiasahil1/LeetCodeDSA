class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> triangle = new ArrayList<>();
        
        for(int i=0; i <=rowIndex ;i++){
            
            List<Integer> row = new ArrayList<>();
            
            row.add(1);
            
            for(int j =1; j <i; j++){
                
                List<Integer> prevRow = triangle.get(i-1);
                
                int sum = prevRow.get(j-1) + prevRow.get(j);
                row.add(sum);
            }
            
           if(i > 0){
                row.add(1);
           }
            
            triangle.add(row);
            
        }
        
        return  triangle.get(rowIndex);
    }
}