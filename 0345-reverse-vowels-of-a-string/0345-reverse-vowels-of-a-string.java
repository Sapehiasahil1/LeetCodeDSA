class Solution {
    public String reverseVowels(String s) {
        
        int n = s.length();
        int lp = 0;
        int rp = n-1;
        
        char arr[] = s.toCharArray();
        
        while(lp <rp){
            
            while(lp < rp && !isVowel(arr[lp])){
                lp++;
            }
            
            while(lp < rp && !isVowel(arr[rp])){
                rp--;
            }
            
            char temp = arr[lp];
            arr[lp] = arr[rp];
            arr[rp] = temp;
            
            lp++;
            rp--;
        }
        
        return new String(arr);
    }
    
    public boolean isVowel(char c){
        
        if(c =='a' || c== 'e' || c =='i' || c== 'o' || c== 'u' || c =='A' || c== 'E' || c =='I' || c== 'O' || c== 'U'){
            return true;
        }
        
        return false;
    }
}