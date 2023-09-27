class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        // Create a StringBuilder to efficiently build the result string
        StringBuilder result = new StringBuilder();
        
        // Initialize a pointer for the first string
        int i = 0;
        
        // Initialize a pointer for the second string
        int j = 0;

        // Merge the strings alternately
        while (i < word1.length() && j < word2.length()) {
            
            // Append a character from the first string to the result
            result.append(word1.charAt(i));
            
            // Append a character from the second string to the result
            result.append(word2.charAt(j));
            
            // Move to the next character in the first string
            i++;
            
            // Move to the next character in the second string
            j++;
        }

        // Append the remaining characters from the first string to the result
        while (i < word1.length()) {
            
            result.append(word1.charAt(i));
            
            i++;
        }

        // Append the remaining characters from the second string to the result
        while (j < word2.length()) {
            
            result.append(word2.charAt(j));
            
            j++;
        }

        // Convert the StringBuilder to a string and return the result
        return result.toString();
        
        
        
    }
}