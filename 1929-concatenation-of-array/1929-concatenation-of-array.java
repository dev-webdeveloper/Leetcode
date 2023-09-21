class Solution {
   
    
    
    public int[] getConcatenation(int[] nums) {
        
        //calculates the length of the input array nums and stores it in the variable len
        int len = nums.length;
        
        
        //creates a new integer array ans with a length of 2 * len, which is twice the length of the input array. This array will hold the concatenated element
        int[] ans = new int[2*len];
        
        //The for loop iterates over the elements of the nums array
        for(int i = 0; i < len; i++){
            
            //copies the current element from nums to the corresponding position in the ans array, filling the first half of ans with the elements from nums
            ans[i] = nums[i];
            
            //copies the same element again, but this time it places it in the second half of the ans array, effectively concatenating the elements of nums with themselves
            ans[i+len] = nums[i];
        }
    
        //the ans array, which now contains the concatenated elements, is returned as the result
        return ans;
    
        
        
    }
}