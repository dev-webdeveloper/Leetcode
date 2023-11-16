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
    public int goodNodes(TreeNode root) {
           return countGoodNodes(root, Integer.MIN_VALUE);
    }

    // Recursive helper method to count good nodes
    private int countGoodNodes(TreeNode node, int maxVal) {
        // Base case: if the node is null, return 0
        if (node == null) {
            return 0;
        }

        // Check if the current node is a good node
        int count = (node.val >= maxVal) ? 1 : 0;

        // Update maxVal for the child nodes
        maxVal = Math.max(maxVal, node.val);

        // Recursively count good nodes in the left and right subtrees
        count += countGoodNodes(node.left, maxVal);
        count += countGoodNodes(node.right, maxVal);

        // Return the total count of good nodes
        return count;

    }
}