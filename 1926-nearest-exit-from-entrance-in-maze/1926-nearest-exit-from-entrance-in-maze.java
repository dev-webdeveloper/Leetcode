class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        
        int m = maze.length;
        
        int n = maze[0].length;

        // Direction arrays for moving up, down, left, and right
        int[] dx = {-1, 1, 0, 0};
        
        int[] dy = {0, 0, -1, 1};

        // Create a queue for BFS
        Queue<int[]> queue = new LinkedList<>();
        
        queue.offer(new int[]{entrance[0], entrance[1], 0}); // Entrance position and steps

        // Mark the entrance as visited
        maze[entrance[0]][entrance[1]] = '+';

        while (!queue.isEmpty()) {
        
            int[] current = queue.poll();
            
            int x = current[0];
            
            int y = current[1];
            
            int steps = current[2];

            // Check if the current position is an exit (excluding the entrance)
            if ((x != entrance[0] || y != entrance[1]) && (x == 0 || x == m - 1 || y == 0 || y == n - 1)) {
                
                return steps;
            }

            // Explore neighbors
            for (int i = 0; i < 4; i++) {
                
                int nx = x + dx[i];
                
                int ny = y + dy[i];

                // Check if the neighbor is within bounds and not visited
                if (nx >= 0 && nx < m && ny >= 0 && ny < n && maze[nx][ny] == '.') {
                    
                    // Mark the neighbor as visited and add it to the queue
                    maze[nx][ny] = '+';
                
                    queue.offer(new int[]{nx, ny, steps + 1});
                }
            }
        }

        // No exit found
        return -1;
    }
}