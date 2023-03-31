class Solution {
    public int fib(int n) {
        
        return Fib(n,new int [n+1]);
    }
    
    public int Fib(int n , int qb[]){
        
        
        if(n==0 || n==1 ){
            return n;
            
        }
        
        if(qb[n]!= 0){
            return qb[n];
        }
        
        int Fibnm1 = Fib(n-1,qb);
        int Fibnm2 = Fib(n-2,qb);
        int fibn = Fibnm1 + Fibnm2;
        
        qb[n] = fibn;
        return fibn;
    }
}