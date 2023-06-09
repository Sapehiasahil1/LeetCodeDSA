class Solution {
    public boolean canJump(int[] nums) {
        int maxPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= maxPosition) {
                
                maxPosition = Math.max(i + nums[i], maxPosition);
                
                if (maxPosition >= nums.length - 1) return true;
            }
        }
        return false;
    }
}