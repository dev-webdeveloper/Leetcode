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
    
    private int max_length = 0;

    public int longestZigZag(TreeNode root) {
        
      if (root == null) {
          
            return 0;
          
        }

        dfs(root.left, 1, 1); // Start with the left child in the right direction
        
        dfs(root.right, 0, 1); // Start with the right child in the left direction

        return max_length;
    }

    private void dfs(TreeNode node, int direction, int length) {
        
        if (node == null) {
            
            return;
            
        }

        // Update the maximum ZigZag length
        max_length = Math.max(max_length, length);

        // Recursive calls for left and right children
        if (direction == 0) {
            
            dfs(node.left, 1, length + 1);
            
            dfs(node.right, 0, 1); // Reset length when changing direction
            
        } else {
            
            dfs(node.right, 0, length + 1);
            
            dfs(node.left, 1, 1); // Reset length when changing direction
        }
        
    }
}