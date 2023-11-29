class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        // Get the number of cities
        int n = isConnected.length;

        // Array to keep track of visited cities
        boolean[] visited = new boolean[n];

        // Variable to count the number of connected components
        int circles = 0;

        // Iterate through each city
        for (int i = 0; i < n; i++) {
            
            // If the city has not been visited, start a new connected component
            if (!visited[i]) {
                
                // Perform DFS to mark all connected cities as visited
                dfs(isConnected, visited, i);
                
                // Increment the number of connected components
                circles++;
                
            }
        }

        // Return the total number of connected components
        return circles;
    }

    // Depth-First Search to mark connected cities as visited
    private void dfs(int[][] isConnected, boolean[] visited, int city) {
        
        // Iterate through all cities
        for (int j = 0; j < isConnected.length; j++) {
            
            // If there is a connection to city j and it has not been visited
            if (isConnected[city][j] == 1 && !visited[j]) {
                
                // Mark city j as visited
                visited[j] = true;
                
                // Recursively perform DFS on city j
                dfs(isConnected, visited, j);
                
            }
        }

    }
}