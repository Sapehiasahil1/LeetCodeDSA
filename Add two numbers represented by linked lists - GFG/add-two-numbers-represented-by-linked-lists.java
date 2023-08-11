//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first = reverse(first);
        second = reverse(second);
        
        Node curr1 =first;
        Node curr2 = second;
        
        int carry =0;
        
        Node dummyNode = new Node(0);
        Node temp = dummyNode;
        
        while(curr1 != null && curr2 != null) {
            
            int sum = curr1.data + curr2.data + carry;
            int val = sum%10;
            carry = sum/10;
            
            Node newNode = new Node(val);
            temp.next = newNode;
            temp = newNode;
            
            curr1 = curr1.next;
            curr2 = curr2.next;
            
        }
        
        while(curr1 != null) {
            
            int sum = curr1.data+carry;
            int val = sum%10;
            carry = sum/10;
            
            Node newNode = new Node(val);
            temp.next = newNode;
            temp = newNode;
            
            curr1 = curr1.next;
        }
        
         while(curr2 != null) {
            
            int sum = curr2.data+carry;
            int val = sum%10;
            carry = sum/10;
            
            Node newNode = new Node(val);
            temp.next = newNode;
            temp = newNode;
            
            curr2 = curr2.next;
        }
        
        if(carry != 0) {
            Node newNode = new Node(carry);
            temp.next= newNode;
            temp = newNode;
        }
        return reverse(dummyNode.next);
    }
    
    private static Node reverse(Node head) {
        
        Node prev = null;
        Node curr = head;
        
        while(curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}