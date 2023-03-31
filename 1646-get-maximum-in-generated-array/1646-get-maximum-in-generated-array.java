class Solution {
    public int getMaximumGenerated(int n) {
        
        int nums[] =  new int [n+1];
        
        for(int i=0; i <= n ; i++){
            
           if(i==0 ||i ==1){
               
               nums[i] += i;
           } 
            
            if(i%2==0){
                nums[i] = nums[i/2];
                
            } else{
                int j = i/2;
                nums[i] = nums[j] +nums[j+1];
            }
            
        }
        
        Arrays.sort(nums);
        
        return nums[n];
    }
}