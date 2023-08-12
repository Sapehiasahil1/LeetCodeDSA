//{ Driver Code Starts
import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class MultiplyTwoLL{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Node head=null;
			Node phead=null;
			int n=sc.nextInt();
			while(n-->0){
				int n1=sc.nextInt();
				if(head==null)
				head=new Node(n1);
			else{
				addHead(head,n1);
			}
			}
			int m=sc.nextInt();
			while(m-->0){
				int n1=sc.nextInt();
				if(phead==null)
				phead=new Node(n1);
			else{
				addPhead(phead,n1);
			}
			}
		GfG g=new GfG();

System.out.println(g.multiplyTwoLists(head,phead));
		}
	}
    public static void addHead(Node node,int a) {
          if (node == null)
            return;
		if(node.next==null)
			node.next=new Node(a);
		else
			addHead(node.next,a);
	}
	public static void addPhead(Node node,int a){
		 if (node == null)
            return;
		if(node.next==null)
		node.next=new Node(a);
	else
		addPhead(node.next,a);
	}
	}
	
	
// } Driver Code Ends


/*Node is defined as
class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          //add code here.
          
        Node curr1 = l1;
        Node curr2 = l2;
        
        long mul1 = 0;
        long mul2 =0;
        int mod = 1000000007;
        
        while(curr1 != null) {
            
            mul1 = (mul1 * 10 + (curr1.data))%mod;
            curr1 = curr1.next;
        }
        
        while(curr2 != null) {
            
            mul2 = (mul2 *10 + (curr2.data))%mod;
            curr2 = curr2.next;
        }
        
        return (mul1*mul2)%mod;
   }
}