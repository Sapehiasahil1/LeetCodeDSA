class Solution {
    public String removeStars(String s) {
        
        Stack<Character> stack = new Stack<>();
        int n = s.length();
       
        
        for(int i=0; i<n ;i++){
            
            char c = s.charAt(i);
            
            if(c == '*'){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        
       StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
        
        return str.reverse().toString();
    }
}