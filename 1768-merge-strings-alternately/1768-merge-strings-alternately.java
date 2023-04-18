class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String merge = "";
        
        int i=0, j=0;
        
        while(i < word1.length() && j<word2.length()) {
            
            merge = merge + word1.charAt(i++);
            merge = merge + word2.charAt(j++);
        }
        
        while(i<word1.length()) {
            merge = merge+ word1.charAt(i++);
        }
        
        while(j<word2.length()) {
            merge = merge+word2.charAt(j++);
        }
        return merge;
    }
}