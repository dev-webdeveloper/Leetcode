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
        public int pathSum(TreeNode root, int targetSum) {
            // If the root is null, there are no paths
        if (root == null)
            return 0;

        // Call the helper method to calculate paths starting from the current node
        // Include paths from the left and right subtrees
        return getSum(root, targetSum, 0) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    // Helper method to calculate paths starting from the current node
    public int getSum(TreeNode root, int targetSum, long sum) {
        int res = 0;

        // If the current node is null, return 0
        if (root == null)
            return res;

        // Add the current node's value to the running sum
        sum += root.val;

        // If the running sum equals the target sum, increment the result count
        if (sum == targetSum)
            res++;

        // Recursively explore paths in the left and right subtrees
        res += getSum(root.left, targetSum, sum);
        res += getSum(root.right, targetSum, sum);

        // Backtrack: subtract the current node's value to explore other paths
        sum -= root.val;

        return res;
    }
}