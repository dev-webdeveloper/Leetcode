class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int firstMin = Integer.MAX_VALUE;
        
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            
            if (num <= firstMin) {
                
                firstMin = num;
                
            } else if (num <= secondMin) {
                
                secondMin = num;
                
            } else {
                
                // If we reach here, we found a triplet
                return true;
                
            }
            
        }

        return false; // No increasing triplet found
    
    }
}