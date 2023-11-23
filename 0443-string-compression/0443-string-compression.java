class Solution {
    public int compress(char[] chars) {
        
         // Get the length of the input character array
        int length = chars.length;
        
        // If the array is empty or contains only one character, no compression is needed
        if (length <= 1) {
            
            return length;
            
        }

        // Initialize variables to keep track of the compressed length and count of consecutive characters
        int compressedLength = 0;
        
        int count = 1;

        // Loop through the character array starting from the second character (index 1)
        for (int i = 1; i < length; i++) {
            
            // If the current character is the same as the previous one
            if (chars[i] == chars[i - 1]) {
                
                // Increment the count of consecutive characters
                count++;
                
            } else {
                
                // If we encounter a different character
                // 1. Add the previous character to the result
                
                chars[compressedLength++] = chars[i - 1];
                
                // 2. If there were more than one consecutive characters, add the count as characters
                if (count > 1) {
                    
                    char[] countChars = String.valueOf(count).toCharArray();
                    
                    for (char c : countChars) {
                        
                        chars[compressedLength++] = c;
                        
                    }
                }
                
                // Reset the count for the new character
                
                count = 1;
                
            }
        }

        // Add the last character to the result
        chars[compressedLength++] = chars[length - 1];

        // If there were more than one consecutive characters at the end, add the count as characters
        if (count > 1) {
            
            char[] countChars = String.valueOf(count).toCharArray();
            
            for (char c : countChars) {
                
                chars[compressedLength++] = c;
                
            }
        }

        // Return the length of the compressed array
        return compressedLength;
        
    }
}