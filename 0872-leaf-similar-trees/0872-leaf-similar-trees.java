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
        
        List<Integer> leafSequence1 = new ArrayList<>();
        
        List<Integer> leafSequence2 = new ArrayList();
        
        // Method calls to get leaf nodes' values for each tree
        getLeafNodes(root1, leafSequence1);
        
        getLeafNodes(root2, leafSequence2);

        // If the sizes of the two leaf sequences are different, they are not leaf-similar
        if (leafSequence1.size() != leafSequence2.size()) {
            
            return false;
            
        }

        // Compare two leaf sequences to check if they are the same
        for (int i = 0; i < leafSequence1.size(); i++) {
            
            if (leafSequence1.get(i) != leafSequence2.get(i)) {
                
                return false;
                
            }
        }
        
        // If the two trees are leaf-similar
        return true;
        
    }
    
    // Method to get leaf nodes' values using DFS
    private void getLeafNodes(TreeNode node, List<Integer> leafSequence) {
        
        if (node == null) {
            
            return;
            
        }
        
        if (node.left == null && node.right == null) {
            leafSequence.add(node.val);
            
        }
        
        getLeafNodes(node.left, leafSequence);
        
        getLeafNodes(node.right, leafSequence);
        
    }
}