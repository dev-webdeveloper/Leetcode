class Solution {
    public int equalPairs(int[][] grid) {
        
        int n = grid.length;
        
        int count = 0;

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                
                // Check if row i and column j are equal
                if (isEqual(grid[i], getColumn(grid, j, n))) {
                    
                    count++;
                    
                }
            }
        }

        return count;
    }

    // Function to extract a column from the grid
    private int[] getColumn(int[][] grid, int col, int n) {
        
        int[] column = new int[n];
        
        for (int i = 0; i < n; i++) {
            
            column[i] = grid[i][col];
        }
        
        return column;
    }

    // Function to check if two arrays are equal
    private boolean isEqual(int[] arr1, int[] arr2) {
        
        if (arr1.length != arr2.length) {
            
            return false;
            
        }

        for (int i = 0; i < arr1.length; i++) {
            
            if (arr1[i] != arr2[i]) {
                
                return false;
                
            }
        }

        return true;
   }
}