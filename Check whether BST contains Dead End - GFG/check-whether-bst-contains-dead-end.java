//{ Driver Code Starts

import java.util.*;
import java.io.*;
class Node {
        int data;
        Node left, right;
 
        Node(int item) {
            data = item;
            left = right = null;
        }
    }
class BinarySearchTree {
    public static Node root;
    BinarySearchTree() { 
        root = null; 
    }
    void insert(int key) {
       root = insertRec(root, key);
    }
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
        return root;
    }
 
    public static void inorder()  {
       inorderRec(root);
    }
    public static void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data);
            inorderRec(root.right);
        }
    }
 
    // Driver Program to test above functions
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int []a=new int[n];
            BinarySearchTree obj1=new BinarySearchTree();
            for(int i=0;i<n;i++)
            {
                int b=sc.nextInt();
                obj1.insert(b);
            }
            //inorder();
            GFG obj=new GFG();
            boolean k=obj.isDeadEnd(root);
            if(k==true)
            System.out.println("1");
            else
            System.out.println("0");
        }       
    }
}


// } Driver Code Ends


/*class Node {
        int data;
        Node left, right;
 
        Node(int item) {
            data = item;
            left = right = null;
        }
    }*/

//Function should return true if a deadEnd is found in the bst otherwise return false.
class GFG
{
    public static boolean isDeadEnd(Node root)
    {
        //Add your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        getNodes(root, map);
        
        return check(root,map);
    }
    
    private static void getNodes( Node root, HashMap<Integer, Integer> map) {
        
        if(root == null)
        return;
        
        map.put(root.data,1);
        getNodes(root.left, map);
        getNodes(root.right, map);
    }
    
    private static boolean check (Node root, HashMap<Integer, Integer> map ) {
        
        if(root == null)
        return false;
        
        if(root.left == null && root.right == null) {
            
            int pre = root.data -1;
            int post = root.data+1;
            
            if(map.containsKey(pre) && map.containsKey(post))
            return true;
        }
        
        return check(root.left, map) || check(root.right,map);
    }
}