class Solution {
    public int tribonacci(int n) {
        
        // Base cases
        if (n == 0) return 0;
        
        if (n == 1 || n == 2) return 1;
        
        // Initialize an array to store Tribonacci numbers
        int[] tribonacciArray = new int[n + 1];
        
        tribonacciArray[0] = 0;
        tribonacciArray[1] = 1;
        tribonacciArray[2] = 1;
        
        // Calculate Tribonacci numbers for the rest of the sequence
        for (int i = 3; i <= n; i++) {
            
            tribonacciArray[i] = tribonacciArray[i - 1] + tribonacciArray[i - 2] + tribonacciArray[i - 3];
            
        }
        
        // Return the Tribonacci number for the given input n
        return tribonacciArray[n];
        
    }
}