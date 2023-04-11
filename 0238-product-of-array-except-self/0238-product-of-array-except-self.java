class Solution {
    public int[] productExceptSelf(int[] nums) {
     
        int n = nums.length;
        int result [] = new int[n];
        result[0] =1;
        
        int left =1;
        
        for(int i=1; i<n; i++) {
            
            if(i>0)
                 left = left*nums[i-1];
            
            result[i] = left;
        }
        
        int right = 1;
        
        for(int i= n-1; i>=0; i--){
            
            result[i] *=right;
            right = right*nums[i];
            
        }
        
        return result;
    }
}