public class Solution {
    public int maxVowels(String s, int k) {
        
        int maxVowelCount = 0;
        
        int vowelCount = 0;

        // Function to check if a character is a vowel.
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        // Initialize the vowel count for the first window of size k.
        for (int i = 0; i < k; i++) {
            
            if (vowels.contains(s.charAt(i))) {
                
                vowelCount++;
                
            }
        }

        maxVowelCount = vowelCount;

        // Update maxVowelCount and vowelCount as you slide the window.
        for (int i = k; i < s.length(); i++) {
            
            if (vowels.contains(s.charAt(i))) {
                
                vowelCount++;
                
            }
            
            if (vowels.contains(s.charAt(i - k))) {
                
                vowelCount--;
                
            }
            
            maxVowelCount = Math.max(maxVowelCount, vowelCount);
        }

        return maxVowelCount;
    }
}
