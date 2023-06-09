/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int count;
    
    public int goodNodes(TreeNode root) {
        
        count =0;
        if(root == null){
            return count;
        }

        counting(root, Integer.MIN_VALUE);
        return count;
    }
    
    public void counting(TreeNode root,int max){
        
       if(root == null) 
          return;
        
        if(root.val >= max) 
            count++;
        
        max = Math.max(max, root.val);
        counting(root.left, max);
        counting(root.right, max);
    }
}