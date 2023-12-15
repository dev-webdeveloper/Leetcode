class Solution {
    public int findPeakElement(int[] nums) {
        
        int n = nums.length;

        // Handle edge cases for arrays with 0 or 1 elements
        if (n == 0) {
        
            return -1; // No peak element in an empty array
        
        }
        
        if (n == 1) {
        
            return 0; // The only element is a peak
        
        }

        // Check the first element
        if (nums[0] > nums[1]) {
        
            return 0;
        
        }

        // Check the last element
        if (nums[n - 1] > nums[n - 2]) {
        
            return n - 1;
        
        }

        // Iterate through the array to find a peak element
        for (int i = 1; i < n - 1; i++) {
        
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
            
                return i;
            
            }
        }

        // If no peak element is found, return -1 or handle it according to your requirements
        return -1;
    }
}