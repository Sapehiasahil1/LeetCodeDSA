class Solution {
    public int longestSubarray(int[] nums) {
        
        int zeroCount =0;
        int answer = 0;
        int n = nums.length;
        int start =0;
        for(int i=0; i<n; i++){
            
            if(nums[i] ==0){
                zeroCount++;
            }
            
            while(zeroCount >1){
                
                if(nums[start] ==0){
                    zeroCount--;
                }
                start++;
            }
            
            answer = Math.max(answer, i-start);
        }
        return answer;
    }
}