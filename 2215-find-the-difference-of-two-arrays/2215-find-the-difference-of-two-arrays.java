class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
     
        HashSet<Integer> set1 = new HashSet<>();
        
        for(int i : nums1){
            set1.add(i);
        }
        
        HashSet<Integer> set2 = new HashSet<>();
        
        for(int j: nums2){
            set2.add(j);
        }
        
        List<Integer> list1 = new ArrayList<>();
        
        for(int i : nums1){
            
            if(!set2.contains(i)){
                if(!list1.contains(i)){
                    list1.add(i);
                }
            }
        }
        
        List<Integer> list2 = new ArrayList<>();
        
        for(int j: nums2){
            
            if(!set1.contains(j)){
                if(!list2.contains(j)){
                    list2.add(j);
                }
            }
        }
        
        List<List<Integer>> result = new ArrayList<>();
        
        result.add(list1);
        result.add(list2);
        
        return result;
    }
}