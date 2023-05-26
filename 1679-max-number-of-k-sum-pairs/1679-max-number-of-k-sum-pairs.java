class Solution {
    public int maxOperations(int[] nums, int k) {
        
        int totalOperations = 0;
        Arrays.sort(nums);
        int lp =0;
        int rp = nums.length-1;
        
        while(lp < rp){
            
            int val = nums[lp] + nums[rp];
            
            if(val == k){
                totalOperations++;
                lp++;
                rp--;
            } else if(val <k){
                lp++;
            } else {
                rp--;
            }
        }
        
        return totalOperations;
    }
}