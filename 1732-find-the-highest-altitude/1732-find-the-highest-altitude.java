class Solution {
    public int largestAltitude(int[] gain) {
        
        int sum =0;
        int maxSum =sum;
        
        int n = gain.length; 
        
        for(int i=0; i<n; i++){
            
            sum += gain[i];
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}