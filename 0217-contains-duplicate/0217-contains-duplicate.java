class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        
        for(int i=0; i<n; i++){
            
            if(!map.containsKey(nums[i])){
                
                map.put(nums[i],1);
            } else {
                
                map.put(nums[i],map.get(nums[i])+1);
            }
            
            if(map.get(nums[i]) >=2){
                return true;
            }
        }
        return false;
    }
}