class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : arr){
            
            if(!map.containsKey(i)){
                
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+1);
            }
        }
        
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}