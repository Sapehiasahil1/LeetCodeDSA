class Solution {
    public int tribonacci(int n) {
        
        return Trib(n, new int [n+1]);
    }
    
    public int Trib(int n, int [] qb){
        
        if(n==0){
            return 0;
        }
        
        if(n ==1 || n==2){
            return 1;
        }
        
        if(qb[n]!=0){
            return qb[n];
        }
        
        int Tribnm1 = Trib(n-1,qb);
        int Tribnm2 = Trib(n-2,qb);
        int Tribnm3 = Trib(n-3,qb);
        int tribn = Tribnm1 + Tribnm2 + Tribnm3;
        
        qb[n] = tribn;
        
        return tribn;
    }
}