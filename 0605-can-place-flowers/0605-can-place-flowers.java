class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        int count = 0;
        
        int i = 0;
        
        while (i < flowerbed.length) {
            
            // Check if the current position is empty (flowerbed[i] == 0)
            if (flowerbed[i] == 0) {
                
                // Check if it's the first position, last position, or the next position is empty
                // This ensures that we can plant a flower at this position
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    
                    // Plant a flower at this position
                    flowerbed[i] = 1;
                    
                    count++;
                    
                }
                
            }
            
            i++;
            
        }
        
        // Check if we were able to plant 'n' flowers
        return count >= n;
        
    }
}