class Solution {
    
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        int n = pushed.length;
        int m = popped.length;
        int j = 0;
        
        Stack<Integer> s = new Stack<>();
        
        for(int i=0; i<n; i++){
            s.push(pushed[i]);
            
            while(!s.isEmpty() && s.peek() == popped[j]) {
                s.pop();
                j++;
            }
        }
        
        while(!s.isEmpty() && j < m && s.peek() == popped[j]) {
            s.pop();
            j++;
        }
        
        return s.isEmpty();
    }
}
