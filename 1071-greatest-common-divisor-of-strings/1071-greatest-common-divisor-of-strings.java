class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        // Check if concatenating str1 and str2 in both orders results in the same string
        // If not, there is no common divisor, so return an empty string
        if (!(str1 + str2).equals(str2 + str1)) {
            
            return "";
            
        }
        
        // Extract a substring of str1 with a length equal to the GCD
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
    
    // Helper function to calculate the greatest common divisor (GCD) using Euclidean algorithm
    private int gcd(int a, int b) {
        
        if (b == 0) {
            
            return a;
            
        } else {
            
            return gcd(b, a % b);
            
        }

    
    
    }
}