class Solution {
    public boolean divisorGame(int n) {
        
        boolean AliceWin = false;
        
        
        return fun( n, AliceWin);
    }
    
    public boolean fun(int n, boolean AliceWin){
        
        for(int i=1; i<n; i++){
            
            if( n % i == 0){
                
                if(AliceWin == false){
                    AliceWin = true;
                   return  fun (n-i,AliceWin);
                } else {
                    AliceWin = false;
                    return fun (n-i, AliceWin);
                }
                
            }
        }
        return AliceWin;
    }
}