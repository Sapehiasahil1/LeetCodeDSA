class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        int n= arr.length;
        Arrays.sort(arr);
        
        int value = arr[1] -arr[0];
        for(int i=0; i<n-1; i++){
            
            if(arr[i+1]-arr[i] != value){
                return false;
            }
        }
        
        return true;
    }
}