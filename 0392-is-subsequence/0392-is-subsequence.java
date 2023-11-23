class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int sIndex = 0;
        
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                
                sIndex++; // Move to the next character in s
            }
            
            tIndex++; // Always move to the next character in t
            
        }
        
        // If we've successfully traversed the entire s, it is a subsequence of t.
        return sIndex == s.length();
    }
}