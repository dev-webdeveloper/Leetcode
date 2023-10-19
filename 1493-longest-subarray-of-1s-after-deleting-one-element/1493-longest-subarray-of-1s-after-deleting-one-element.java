class Solution {
    public int longestSubarray(int[] nums) {
        
        int maxLen = 0;  // Maximum length
        
        int count1 = 0;  // Current count of 1s
        
        int left = 0;    // Left index of the window

        for (int right = 0; right < nums.length; right++) {
            
            if (nums[right] == 1) {
                
                count1++;
                
            }

            // Adjust the window size to allow at most one 0
            while (right - left + 1 - count1 > 1) {
                
                if (nums[left] == 1) {
                    
                    count1--;
                    
                }
                
                left++;
            }

            // Update the maximum length
            maxLen = Math.max(maxLen, right - left + 1);
            
        }

        // Return the maximum length with at most one 0
        return maxLen - 1;
        
    }
}