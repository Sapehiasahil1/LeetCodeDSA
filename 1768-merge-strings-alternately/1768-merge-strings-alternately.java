class Solution {
    public String mergeAlternately(String word1, String word2) {
     
        int n1 = word1.length();
        int n2 = word2.length();
        
        String res = "";
        
        int i=0, j=0;
        
        while(i<n1 && j<n2){
            
            res = res+ word1.charAt(i++);
            res = res+ word2.charAt(j++);
        }
        
        while(i<n1){
            res = res+word1.charAt(i++);
        }
        
        while(j<n2){
            res = res+word2.charAt(j++);
        }
        
        return res;
    }
}