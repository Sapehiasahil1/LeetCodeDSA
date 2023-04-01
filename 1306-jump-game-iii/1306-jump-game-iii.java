class Solution {
    
    public boolean canReach(int[] arr, int start) {
        
        int n = arr.length;
        
        boolean[] dp = new boolean[n];
        
        return canReachHelper(arr, start, dp);
    }
    
    private boolean canReachHelper(int[] arr, int i, boolean[] dp) {
        
        if (i < 0 || i >= arr.length || arr[i] < 0) {
            return false;
        }
        
        if (arr[i] == 0) {
            return true;
        }
        if (dp[i]) {
            return false;
        }
        
        dp[i] = true;
        
        boolean result = canReachHelper(arr, i + arr[i], dp) || canReachHelper(arr, i - arr[i], dp);
        
        dp[i] = false;
        
        return result;
    }
}
