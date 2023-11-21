/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            
            return root;
            
        }

        // Recursively search for LCA in the left and right subtrees
        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        // If both nodes are found in different subtrees, the current root is the LCA
        if (leftLCA != null && rightLCA != null) {
            
            return root;
            
        }

        // If one node is found, return that node as a potential ancestor
        return (leftLCA != null) ? leftLCA : rightLCA;
        
    }
}