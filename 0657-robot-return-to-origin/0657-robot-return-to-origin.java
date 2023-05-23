class Solution {
    public boolean judgeCircle(String moves) {
        
        int x =0;
        int y =0;
        int n = moves.length();
        
        for(int i=0; i<n; i++){
            char curr = moves.charAt(i);
            
            if(curr == 'U'){
                y++;
            } else if(curr == 'D'){
                y--;
            } else if(curr == 'L'){
                x--;
            } else if(curr == 'R'){
                x++;
            }
        }
        
        return x==0 && y==0;
    }
}