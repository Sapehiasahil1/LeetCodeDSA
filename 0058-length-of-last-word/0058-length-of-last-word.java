class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i=s.length()-1;int x=0;

        while(i>=0){
            if(s.charAt(i) == ' '){
                if(x==-1){

                    return count;
                }
            }else{
                count++;
                x=-1;
            }
            i--;
        }
        return count;
    }
}