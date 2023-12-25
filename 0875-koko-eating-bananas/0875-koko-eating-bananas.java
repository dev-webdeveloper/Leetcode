class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        // Set the initial search space
        int left = 1;
        
        int right = getMaxPiles(piles);

        // Binary search to find the minimum eating speed
        while (left < right) {
        
            int mid = left + (right - left) / 2; // Calculate the middle of the search space
          
            if (canEatAll(piles, h, mid)) {
          
                right = mid; // Adjust the search space if it's possible to eat all piles at the current speed
            
            } else {
                
                left = mid + 1; // Adjust the search space if it's not possible to eat all piles at the current speed
                
            }
        }

        return left; // The left pointer represents the minimum eating speed
    }

    // Helper method to check if it's possible to eat all piles within h hours at a given speed
    private boolean canEatAll(int[] piles, int h, int speed) {
        
        int hoursNeeded = 0;
        
        for (int pile : piles) {
            
            hoursNeeded += (pile + speed - 1) / speed; // Ceil division to calculate hours needed for each pile
            
        }
        return hoursNeeded <= h; // Check if total hours needed is less than or equal to h
    }

    // Helper method to find the maximum pile size
    private int getMaxPiles(int[] piles) {
        
        int max = Integer.MIN_VALUE;
        
        for (int pile : piles) {
            
            max = Math.max(max, pile);
            
        }
        
        return max;
    }
}