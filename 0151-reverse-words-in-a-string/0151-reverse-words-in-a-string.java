class Solution {
    public String reverseWords(String s) {
        
         // Split the input string into words using whitespace as the delimiter
        String[] words = s.split(" ");
        
        // Initialize a StringBuilder to store the reversed words
        StringBuilder reversed = new StringBuilder();
        
        // Iterate through the words in reverse order and append them to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            
            if (!words[i].isEmpty()) {
                
                reversed.append(words[i]).append(" "); // Append the word followed by a space
            
            }
        
        }
        
        // Remove the trailing space, if any
        if (reversed.length() > 0) {
           
            reversed.setLength(reversed.length() - 1);
       
        }
        
        // Convert the StringBuilder to a String and return it
        return reversed.toString();
        
    }
}