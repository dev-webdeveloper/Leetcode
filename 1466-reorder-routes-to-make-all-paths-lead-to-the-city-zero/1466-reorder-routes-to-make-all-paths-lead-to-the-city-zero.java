class Solution {
    public int minReorder(int n, int[][] connections) {
        
        // Create a set to store the indices of connections that need to be reordered
        Set<Integer> reorderSet = new HashSet<>();
        
        // Create an adjacency list to represent the graph
        Map<Integer, List<int[]>> graph = new HashMap<>();
        
        // Populate the adjacency list
        for (int[] connection : connections) {
            
            int from = connection[0];
            
            int to = connection[1];
            
            // Add the edge to the graph
            graph.computeIfAbsent(from, k -> new ArrayList<>()).add(new int[]{to, 1}); // 1 indicates a forward edge
            
            graph.computeIfAbsent(to, k -> new ArrayList<>()).add(new int[]{from, 0}); // 0 indicates a backward edge
            
        }
        
        // Perform a depth-first search to count the reordered edges
        dfs(0, graph, reorderSet, new HashSet<>());
        
        // Return the count of reordered edges
        return reorderSet.size();
        
    }
    
    private void dfs(int node, Map<Integer, List<int[]>> graph, Set<Integer> reorderSet, Set<Integer> visited) {
        
        // Mark the current node as visited
        visited.add(node);
        
        // Traverse the neighbors of the current node
        for (int[] neighbor : graph.getOrDefault(node, Collections.emptyList())) {
            
            int nextNode = neighbor[0];
            
            int edgeType = neighbor[1];
            
            // If the edge is a forward edge and the next node hasn't been visited, reorder it
            if (edgeType == 1 && !visited.contains(nextNode)) {
                
                reorderSet.add(nextNode);
                
            }
            
            // Recursively visit the next node if it hasn't been visited
            if (!visited.contains(nextNode)) {
                
                dfs(nextNode, graph, reorderSet, visited);
                
            }
        }
    }
}