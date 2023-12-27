class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        
        // Initialize the result list to store valid combinations
        List<List<Integer>> result = new ArrayList<>();
       
        // Start the backtracking process with an empty current combination, starting from 1
        backtrack(result, new ArrayList<>(), k, n, 1);
        
        // Return the final list of combinations
        return result;
    
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int k, int remaining, int start) {
    
        // Base case: if k and remaining are both 0, a valid combination is found
        if (k == 0 && remaining == 0) {
        
            // Add a copy of the current combination to the result list
            result.add(new ArrayList<>(current));
            
            return;
        
        }

        // Iterate through possible numbers from start to 9
        for (int i = start; i <= 9; i++) {
        
            // Add the current number to the combination
            current.add(i);
            
            // Recursively call backtrack with updated parameters
            // k-1: decrease the count of numbers to be used
            // remaining-i: subtract the current number from the remaining sum
            // i+1: update the starting point for the next iteration to avoid duplicates
            backtrack(result, current, k - 1, remaining - i, i + 1);
            
            // Backtrack by removing the last added element to explore other possibilities
            current.remove(current.size() - 1);
       
        }

    }
}