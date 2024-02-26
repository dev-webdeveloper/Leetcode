/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
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