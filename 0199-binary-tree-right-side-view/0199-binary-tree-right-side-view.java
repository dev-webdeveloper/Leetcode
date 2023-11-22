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
    public List<Integer> rightSideView(TreeNode root) {
        
        // Create a list to store the result
        List<Integer> result = new ArrayList<>();
        
        // Check if the root is null
        if (root == null) {
            
            return result;
            
        }

        // Create a queue for level-order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        
        // Add the root to the queue to start traversal
        queue.offer(root);

        // Perform level-order traversal
        while (!queue.isEmpty()) {
            
            // Get the number of nodes at the current level
            int size = queue.size();

            // Iterate through the nodes at the current level
            for (int i = 0; i < size; i++) {
                
                // Get the current node
                TreeNode current = queue.poll();

                // If it's the last node at this level, add its value to the result
                if (i == size - 1) {
                    
                    result.add(current.val);
                    
                }

                // Add the children of the current node to the queue for the next level
                if (current.left != null) {
                    
                    queue.offer(current.left);
                    
                }
                if (current
                    .right != null) {
                    
                    queue.offer(current.right);
                }
            }
        }

        // Return the final result list containing the right side view
        return result;
    }
}