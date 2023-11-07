class Solution {
    public String decodeString(String s) {
        
        // Stacks to hold counts and intermediate results
        Stack<Integer> countStack = new Stack<>();
        
        Stack<String> resultStack = new Stack<>();
        
        // Variables to hold intermediate values
        String currentString = "";
        
        int count = 0;

        // Iterate through the input string
        for (char ch : s.toCharArray()) {
            
            if (Character.isDigit(ch)) {
                
                // Calculate the count for the string repetition
                count = count * 10 + (ch - '0');
                
            } else if (ch == '[') {
                
                // Push the current count and result to respective stacks
                countStack.push(count);
                
                resultStack.push(currentString);
                
                // Reset count and currentString for new nested string
                count = 0;
                
                currentString = "";
                
            } else if (ch == ']') {
                
                // When ']' is encountered, retrieve the count and previous string
                StringBuilder temp = new StringBuilder(resultStack.pop());
                
                int times = countStack.pop();
                
                // Repeat the current string 'times' times
                for (int i = 0; i < times; i++) {
                    
                    temp.append(currentString);
                    
                }
                
                // Update currentString with the recently constructed string
                currentString = temp.toString();
                
            } else {
                
                // For normal characters, build the current string
                currentString += ch;
                
            }
        }
        
        // Return the decoded string
        return currentString;
    }
}