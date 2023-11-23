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
    public int maxLevelSum(TreeNode root) {
        
        // Check if the root is null (empty tree)
        if (root == null) {
            
            return 0;
            
        }

        int maxLevel = 1; // Initialize the level with the maximum sum to the first level
        
        int maxSum = root.val; // Initialize the maximum sum with the root value

        Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);

        int level = 1; // Initialize the current level

        // Perform level-order traversal (BFS)
        while (!queue.isEmpty()) {
            
            int currentLevelSize = queue.size(); // Number of nodes at the current level
            
            int currentLevelSum = 0; // Sum of values at the current level

            // Process nodes at the current level
            for (int i = 0; i < currentLevelSize; i++) {
                
                TreeNode currentNode = queue.poll(); // Dequeue the current node
                
                currentLevelSum += currentNode.val; // Add the value to the current level sum

                // Enqueue the left and right children if they exist
                if (currentNode.left != null) {
                  
                    queue.offer(currentNode.left);
                
                }

                if (currentNode.right != null) {
                
                    queue.offer(currentNode.right);
               
                }
            }

            // Check if the current level's sum is greater than the maximum sum
            if (currentLevelSum > maxSum) {
               
                maxSum = currentLevelSum; // Update the maximum sum
               
                maxLevel = level; // Update the level with the maximum sum
            }

            level++; // Move to the next level
       
        }

        return maxLevel; // Return the level with the maximum sum
    }
}