//{ Driver Code Starts
import java.util.*;
import java.lang.*;

class Node 
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class SortLL
{
    static Node head;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0) 
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            addToTheLast(head);
            
            for(int i = 1; i< n; i++)
            {
                int a = sc.nextInt();
                addToTheLast(new Node(a));
            }
            
            GfG gfg = new GfG();
            Node node = gfg.quickSort(head);
            
            printList(node);
            System.out.println();
        }
    }
    public static void printList(Node head)
    {
        while(head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    
    public static void addToTheLast(Node node) 
{
  if (head == null) 
  {
    head = node;
  } else 
  {
   Node temp = head;
   while (temp.next != null)
          temp = temp.next;
         temp.next = node;
  }
}
}
// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
    
}*/
// you have to complete this function
class GfG
{
    public static Node quickSort(Node head)
    {
        //Your code here
        if(head == null || head.next == null) 
        return head;
        
        Node pivot = head;
        Node curr = head.next;
        Node lessThanPivot = new Node(0);
        Node greaterThanPivot = new Node(0);
        
        Node lessTail = lessThanPivot;
        Node greaterTail = greaterThanPivot;
        
        while(curr != null) {
            
            if(curr.data < pivot.data) {
                lessTail.next = curr;
                lessTail = lessTail.next;
            } else {
                greaterTail.next = curr;
                greaterTail = greaterTail.next;
            }
            curr = curr.next;
        }
        
        lessTail.next = null;
        greaterTail.next = null;
        
        Node sortedLess = quickSort(lessThanPivot.next);
        Node sortedGreater = quickSort(greaterThanPivot.next);
        
        if(sortedLess == null) {
            pivot.next = sortedGreater;
            return pivot;
        } else {
            
            Node tail = sortedLess;
            
            while(tail.next!= null) {
                tail = tail.next;
            }
            tail.next = pivot;
            pivot.next = sortedGreater;
            return sortedLess;
        }
        
    }
    
    
}