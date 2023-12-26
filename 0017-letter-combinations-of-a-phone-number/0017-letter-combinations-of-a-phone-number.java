class Solution {
    
    // Define a mapping between digits and their corresponding letters
    private static final Map<Character, String> digitMap = new HashMap<>();

    static {
        
        digitMap.put('2', "abc");
        digitMap.put('3', "def");
        digitMap.put('4', "ghi");
        digitMap.put('5', "jkl");
        digitMap.put('6', "mno");
        digitMap.put('7', "pqrs");
        digitMap.put('8', "tuv");
        digitMap.put('9', "wxyz");
        
    }

    // Main method to generate letter combinations
    public List<String> letterCombinations(String digits) {
        
        // Initialize the result list to store combinations
        List<String> result = new ArrayList<>();
        
        // Check if the input is empty
        if (digits == null || digits.length() == 0) {
            
            return result;
        }

        // Start the recursive generation of combinations
        generateCombinations(digits, 0, new StringBuilder(), result);
        
        // Return the final list of combinations
        return result;
    }

    // Recursive helper method to generate combinations
    private void generateCombinations(String digits, int index, StringBuilder current, List<String> result) {
        
        // Base case: if the index reaches the length of the input digits, add the current combination to the result
        if (index == digits.length()) {
            
            result.add(current.toString());
            
            return;
        }

        // Get the current digit and its corresponding letters
        char digit = digits.charAt(index);
        
        String letters = digitMap.get(digit);

        // Iterate over each letter and recurse to generate combinations
        for (char letter : letters.toCharArray()) {
            
            // Append the current letter
            current.append(letter);
            
            // Recursively generate combinations for the next index
            generateCombinations(digits, index + 1, current, result);
            
            // Backtrack: remove the last letter to explore other possibilities
            current.deleteCharAt(current.length() - 1);
        }

   
    }
}