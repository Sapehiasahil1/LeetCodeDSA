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
    
    int maxSum;
    public int maxPathSum(TreeNode root) {
        
        maxSum = Integer.MIN_VALUE;
        fun(root);
        
        return maxSum;
        
    }
    
    public int fun(TreeNode root){
        
        if(root == null){
            return 0;
        }
        
        int leftSide = Math.max(fun(root.left),0);
        int rightSide = Math.max(fun(root.right),0);
        
        int sum = root.val + leftSide + rightSide;
        maxSum = Math.max(maxSum, sum);
        
        return root.val + Math.max(leftSide,rightSide);
    }
}