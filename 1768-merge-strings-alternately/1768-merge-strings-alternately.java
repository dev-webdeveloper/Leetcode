/**

(JavaScript)


 * @param {string} word1
 * @param {string} word2
 * @return {string}
 
var mergeAlternately = function(word1, word2) {
    
    // Initialize an empty string to store the merged result
    let merged = '';
    
    // Initialize indices for both words
    let i = 0; // Index for word1
    let j = 0; // Index for word2

    // Iterate through both words until both words are fully traversed
    while (i < word1.length || j < word2.length) {
        
        // If there are characters remaining in word1
        if (i < word1.length) {
        
            // Append the character from word1 to the merged string
            merged += word1[i];
            
            // Move to the next character in word1
            i++;
            
        }
        
        // If there are characters remaining in word2
        if (j < word2.length) {
            
            // Append the character from word2 to the merged string
            merged += word2[j];
            
            // Move to the next character in word2
            
            j++;
        }
    }

    // Return the merged string
    return merged;
    
};


*/


class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        
        // StringBuilder in Java is a class used to create a mutable, or in other words, a modifiable succession of characters.
        StringBuilder merged = new StringBuilder();
        
        int i = 0;
        int j = 0;
        
        // Loop until both strings have been completely processed
        while ( i < word1.length() || j < word2.length() ) {
            
            // Append character from word1 if available
            if (i < word1.length() ) {
                
                merged.append (word1.charAt(i));
                
                i++;
    
            }
            
            // Append character from word2 if available  
            if (j < word2.length() ) {
                
                merged.append (word2.charAt(j));
                
                j++;
                
            }
            
            
        }
        
        
        return merged.toString();
        
        
        
    }
}