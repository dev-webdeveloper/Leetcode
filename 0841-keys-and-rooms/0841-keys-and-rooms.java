class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        int n = rooms.size();
        
        boolean[] visited = new boolean[n];
        
        // Start DFS from the first room
        dfs(rooms, 0, visited);
        
        // Check if all rooms are visited
        for (boolean roomVisited : visited) {
            
            if (!roomVisited) {
                
                return false;
                
            }
        }
        
        return true;
    }
    
    private void dfs(List<List<Integer>> rooms, int currentRoom, boolean[] visited) {
        
        // Mark the current room as visited
        visited[currentRoom] = true;
        
        // Explore the neighboring rooms
        for (int nextRoom : rooms.get(currentRoom)) {
            
            if (!visited[nextRoom]) {
                
                dfs(rooms, nextRoom, visited);
                
            }
        }
    }
}