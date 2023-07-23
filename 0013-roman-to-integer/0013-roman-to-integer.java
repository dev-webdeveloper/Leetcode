//This code is a Java implementation of a Roman numeral to integer converter. It takes a string s as input, which represents a valid Roman numeral, and returns its corresponding integer value.

class Solution {
    public int romanToInt(String s) {
        
    // a HashMap called m that maps characters (Roman numerals) to their corresponding integer values. For example, 'I' maps to 1, 'V' maps to 5, 'X' maps to 10, and so on
       Map<Character, Integer> m = new HashMap<>();

            // the HashMap with the mappings of each Roman numeral to its corresponding integer value
            m.put('I', 1);
            m.put('V', 5);
            m.put('X', 10);
            m.put('L', 50);
            m.put('C', 100);
            m.put('D', 500);
            m.put('M', 1000);

            //the variable ans to 0. This variable will be used to store the final integer value of the Roman numeral
            int ans = 0;

            //a loop that iterates through each character in the input string s.
            for (int i = 0; i < s.length(); i++) {
                
                //if the current Roman numeral's value is less than the value of the next Roman numeral in the string
                if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {
                
                    //If the condition in the previous step is true, it means that the current Roman numeral is part of a subtraction pair. So, we subtract its value from the running total ans.
                    ans -= m.get(s.charAt(i));
                
                //If the condition in Step 5 is false, it means that the current Roman numeral is not part of a subtraction pair, so we simply add its value to the running total ans.
                } else {
                
                    //the variable ans will hold the integer value corresponding to the Roman numeral provided in the input string s.
                    ans += m.get(s.charAt(i));
                
                }
            }

            //The function returns the final integer value of the Roman numeral.
            return ans;
    }
    
}