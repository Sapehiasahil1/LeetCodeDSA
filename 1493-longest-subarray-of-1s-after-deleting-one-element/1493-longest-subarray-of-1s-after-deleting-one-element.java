class Solution {
    public int longestSubarray(int[] nums) {
        int maxLength = 0;
        int countOnes = 0;
        int left = 0;
        int zeros = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 1) {
                countOnes++;
            } else {
                zeros++;
            }
            
            while (zeros > 1) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left);
        }
        
        return maxLength;
    }
}
