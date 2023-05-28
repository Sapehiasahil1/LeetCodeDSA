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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        ArrayList<Integer> leaf1 = new ArrayList<>();
        ArrayList<Integer> leaf2 = new ArrayList<>();
        
        collectLeaf(root1, leaf1);
        collectLeaf(root2, leaf2);
        
        return leaf1.equals(leaf2);
        
    }
    
    public void collectLeaf(TreeNode root , ArrayList<Integer> leaf){
        
        if(root == null){
            return;
        }
        
        if(root.right == null && root.left == null)
            leaf.add(root.val);
        
        collectLeaf(root.left,leaf);
        collectLeaf(root.right,leaf);
    }
}