class Solution {
    public int maxArea(int[] height) {
        
        // Initialize a variable to store the maximum area.
        int maxArea = 0;         
        
        // Initialize a left pointer at the beginning of the array.
        int left = 0;            
        
        // Initialize a right pointer at the end of the array.
        int right = height.length - 1; 

        // Continue as long as the left pointer is less than the right pointer.
        while (left < right) {   
            
            // Find the minimum height of the two lines.
            int h = Math.min(height[left], height[right]); 
            
            // Calculate the width between the lines.
            int w = right - left; 
            
            // Calculate the area between the lines.
            int area = h * w;     
            
            // Update maxArea with the maximum area found so far.
            maxArea = Math.max(maxArea, area); 

            if (height[left] < height[right]) {
                
                // Move the left pointer to the right if the left line is shorter.
                left++;  
                
            } else {
                
                // Move the right pointer to the left if the right line is shorter.
                right--; 
                
            }
        }

        // Return the maximum area found.
        return maxArea; 
        
    }
}