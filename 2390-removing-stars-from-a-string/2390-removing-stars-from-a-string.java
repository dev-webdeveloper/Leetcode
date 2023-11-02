class Solution {
    public String removeStars(String s) {
        
        // Initialize a StringBuilder to store the resulting string
        StringBuilder result = new StringBuilder();
        
        int n = s.length(); // Length of the input string
        
        for (int i = 0; i < n; i++) { // Iterate through the input string
            
            if (s.charAt(i) == '*') { // If the current character is an asterisk
                
                // Check if the result is not empty and the last character is not an asterisk
                if (result.length() > 0 && result.charAt(result.length() - 1) != '*') {
                  
                    result.deleteCharAt(result.length() - 1); // Delete the last character in result
               
                }
                
            } else { // If the current character is not an asterisk
               
                result.append(s.charAt(i)); // Add the non-asterisk character to the result
            
            }
        }
        
        return result.toString(); // Convert StringBuilder to String and return
        
    }
}