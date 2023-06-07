class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = Integer.MIN_VALUE;
        int n = candies.length;
        
        for(int i=0; i<n; i++){
            
            max = Math.max(max,candies[i]);
        }
        
        List<Boolean> res = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            
            if(candies[i] + extraCandies >= max){
                
                res.add(true);
                
            } else {
                res.add(false);
            }
        }
        
        return res;
    }
}