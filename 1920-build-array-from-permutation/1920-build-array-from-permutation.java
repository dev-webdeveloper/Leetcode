class Solution {
    
    public int[] buildArray(int[] nums) {
        
        int n = nums.length;  // Store the length of the array.
        
        int[] result = new int[n];  // Initialize the result array.
        
        for (int i = 0; i < n; i++) {
            
            // Calculate the value at the current index in the result array.
            // nums[i] represents the position of i in the original array.
            result[i] = nums[nums[i]];
        
        }
        
        return result;  // Return the result array.
        
    }
}