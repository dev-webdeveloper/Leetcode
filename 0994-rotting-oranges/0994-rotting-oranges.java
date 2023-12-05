class Solution {
    public int orangesRotting(int[][] grid) {
        // Check if the grid is empty or invalid
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            
            return 0;
            
        }

        int rows = grid.length;
        
        int cols = grid[0].length;
        
        int freshOranges = 0; // Count of initially fresh oranges
        
        Queue<int[]> queue = new LinkedList<>(); // Queue for BFS
        

        // Initialize the queue with the positions of initially rotten oranges
        for (int i = 0; i < rows; i++) {
            
            for (int j = 0; j < cols; j++) {
                
                if (grid[i][j] == 2) {
                    
                    // Add the position of rotten orange to the queue
                    queue.offer(new int[]{i, j});
                    
                } else if (grid[i][j] == 1) {
                    
                    // Count initially fresh oranges
                    freshOranges++;
                    
                }
            }
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; // Possible directions for BFS
       
        int minutes = 0; // Time required for all oranges to rot

        while (!queue.isEmpty()) {
            
            int size = queue.size(); // Number of oranges at the current minute

            for (int i = 0; i < size; i++) {
                
                int[] curr = queue.poll(); // Get the position of a rotten orange

                for (int[] dir : directions) {
                    
                    int newRow = curr[0] + dir[0];
                    
                    int newCol = curr[1] + dir[1];

                    if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols
                            && grid[newRow][newCol] == 1) {
                        
                        // Mark the adjacent fresh orange as rotten
                        grid[newRow][newCol] = 2;
                        
                        // Add the position of the newly rotten orange to the queue
                        queue.offer(new int[]{newRow, newCol});
                        
                        freshOranges--; // Decrease the count of fresh oranges
                    }
                }
            }

            if (!queue.isEmpty()) {
                
                // If there are more oranges to rot, increment minutes
                minutes++;
                
            }
        }

        // Check if there are any remaining fresh oranges
        return freshOranges == 0 ? minutes : -1;
    }
}