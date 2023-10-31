class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        if (word1.length() != word2.length()) {
            
            return false; // If lengths are different, return false
        
        }
        
        Map<Character, Integer> freqMap1 = new HashMap<>();
        
        Map<Character, Integer> freqMap2 = new HashMap<>();
        
        // Count the frequency of characters in word1
        for (char c : word1.toCharArray()) {
            
            freqMap1.put(c, freqMap1.getOrDefault(c, 0) + 1);
            
        }
        
        // Count the frequency of characters in word2
        for (char c : word2.toCharArray()) {
            
            freqMap2.put(c, freqMap2.getOrDefault(c, 0) + 1);
            
        }
        
        if (freqMap1.keySet().equals(freqMap2.keySet())) {
            
            // If both words contain the same set of characters
            // Create arrays of the frequencies and sort them
            int[] freqArr1 = freqMap1.values().stream().mapToInt(i -> i).toArray();
            
            int[] freqArr2 = freqMap2.values().stream().mapToInt(i -> i).toArray();
            
            Arrays.sort(freqArr1);
            
            Arrays.sort(freqArr2);
            
            // If the sorted frequency arrays are equal, return true
            return Arrays.equals(freqArr1, freqArr2);
            
        }
        
        return false; // If words contain different characters, return false
    }
}