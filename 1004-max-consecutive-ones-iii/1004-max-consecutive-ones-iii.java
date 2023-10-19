class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0; // Left pointer of the window
        
        int maxOnes = 0; // Maximum number of ones seen so far
        
        int zeroCount = 0; // Count of zeros in the current window
        
        for (int right = 0; right < nums.length; right++) {
            
            if (nums[right] == 0) {
                
                zeroCount++;
                
            }
            
            while (zeroCount > k) {
                
                if (nums[left] == 0) {
                    
                    zeroCount--;
                    
                }
                
                left++;
            }
            
            maxOnes = Math.max(maxOnes, right - left + 1);
            
        }
        
        return maxOnes;
        
    }
}