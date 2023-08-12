//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

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

class Driverclass
{
    
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().mergeSort(head);
		     printList(head);
		    System.out.println();
        }
    }
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}



// } Driver Code Ends


//User function Template for Java
/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        // add your code here
        if(head == null || head.next == null)
        return head;
        
       Node prev = null;
       Node slow = head;
       Node fast = head;
       
       while(fast != null && fast.next != null) {
           
           prev = slow;
           slow = slow.next;
           fast = fast.next.next;
       }
       
       prev.next = null;
       
       Node leftSide = mergeSort(head);
       Node rightSide = mergeSort(slow);
        
        return merge(leftSide, rightSide);
    }
    
    private static Node merge(Node head1, Node head2) {
        
        Node mergeL = new Node(-1);
        Node temp = mergeL;
        
        while(head1 != null && head2 != null) {
            
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        
        if(head1 != null) {
            temp.next = head1;
        }else {
            temp.next = head2;
        }
        return mergeL.next;
    }
}


