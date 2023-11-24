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
    public TreeNode searchBST(TreeNode root, int val) {
        
        // Base case: if the root is null or the value is found
        if (root == null || root.val == val) {
            
            return root;
            
        }
        
        // If the value is less than the root value, search in the left subtree
        if (val < root.val) {
            
            return searchBST(root.left, val);
            
        }
        
        // If the value is greater than the root value, search in the right subtree
        return searchBST(root.right, val);
        
    }
}