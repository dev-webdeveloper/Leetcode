class Solution {
    public int maxOperations(int[] nums, int k) {
        
        // Create a HashMap to store the frequency of numbers in the array.
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        int count = 0;

        for (int num : nums) {
            
            // Calculate the complement required to reach k.
            int complement = k - num;

            // Check if the complement is in the HashMap and has a positive frequency.
            if (frequencyMap.getOrDefault(complement, 0) > 0) {
                
                // Decrement the frequency of the complement and increment the count.
                frequencyMap.put(complement, frequencyMap.get(complement) - 1);
                
                count++;
                
            } else {
                
                // Increment the frequency of the current number.
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
                
            }
        }

        return count;
    }
}