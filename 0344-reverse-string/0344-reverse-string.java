class Solution {
    public void reverseString(char[] s) {
        
        // Start index of the array
        int start = 0;
        
        // End index of the array
        int end = s.length - 1;
        
        // Reverse the array while the start index is less than the end index
        while (start < end) {
            
            // Swap the values at the start and end indices
            char temp = s[start];
            
            s[start] = s[end];
            
            s[end] = temp;
            
            // Increment the start index and decrement the end index
            start++;
            
            end--;
        }
        
    }
}

