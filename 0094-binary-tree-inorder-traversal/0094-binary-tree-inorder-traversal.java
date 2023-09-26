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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result = new ArrayList<>();
        
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            
            // Traverse to the leftmost node in the current subtree
            while (current != null) {
                
                stack.push(current);
                
                current = current.left;
                
            }

            // Pop the top node from the stack (current node)
            current = stack.pop();
            
            // Add the value of the current node to the result
            result.add(current.val);
            
            // Move to the right subtree
            current = current.right;
            
        }

        return result;
    }
}