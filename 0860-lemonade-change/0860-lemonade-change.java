class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int fCount =0;
        int tCount =0;
        int twCount =0;
        
        int n = bills.length; 
        
        for(int i=0; i<n; i++){
            
            if(bills[i] == 10){
                
                if(fCount >0){
                    fCount--;
                    tCount++;
                } else {
                    return false;
                }
            } else if(bills[i] == 20){
                
                if(tCount > 0){
                    
                    tCount--;
                    
                    if(fCount >0){
                        fCount --;
                        twCount++;
                    } else {
                        return false;
                    }
                }else {
                    
                    if(fCount >=3){
                        fCount--;
                        fCount--;
                        fCount--;
                    } else {
                        return false;
                    }
                }
            } else {
                fCount++;
            }
        }
        
        return true;
    }
}