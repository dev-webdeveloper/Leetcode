class Solution {
    public void moveZeroes(int[] nums) {
        
        int nonZeroIndex = 0; // Points to the next position where a non-zero element should be placed

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            
            // If the current element is non-zero, move it to the nonZeroIndex position
            if (nums[i] != 0) {
                
                nums[nonZeroIndex] = nums[i];
                
                // If i is not equal to nonZeroIndex, set nums[i] to 0 to avoid duplication
                if (i != nonZeroIndex) {
                    
                    nums[i] = 0;
                    
                }
                
                nonZeroIndex++; // Increment nonZeroIndex
            }
        }
    }
}