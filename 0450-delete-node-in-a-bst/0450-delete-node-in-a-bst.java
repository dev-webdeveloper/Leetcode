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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            
            return null;
            
        }

        if (key < root.val) {
            
            root.left = deleteNode(root.left, key);
            
        } else if (key > root.val) {
            
            root.right = deleteNode(root.right, key);
            
        } else {
            
            // Node with only one child or no child
            if (root.left == null) {
                
                return root.right;
                
            } else if (root.right == null) {
                
                return root.left;
                
            }

            // Node with two children: Get the inorder successor (smallest
            // in the right subtree)
            root.val = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.val);
        }

        return root;
    }

    private int minValue(TreeNode root) {
        
        int minValue = root.val;
        
        while (root.left != null) {
            
            minValue = root.left.val;
            
            root = root.left;
            
        }
        
        return minValue;

    }
}