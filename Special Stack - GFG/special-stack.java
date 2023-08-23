//{ Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isEmpty(s)){
			    g.pop(s);
			}
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}
// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    
    Stack<Integer> min = new Stack<>();
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	    
	    if(min.size() ==0){
	        min.push(a);
	        return;
	    }
	    if(a <= min.peek()) 
	    min.push(a);
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            int a = s.pop();
            
            if(min.peek() == a)
            min.pop();
            
            return a;
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           return min.peek();
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           return s.size() == n;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           return s.isEmpty();
	}
}