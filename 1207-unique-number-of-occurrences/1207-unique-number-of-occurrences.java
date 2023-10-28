class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        // Create a HashMap to store the frequency of each element in the array
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the occurrences of each element in the array
        for (int num : arr) {
            
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            
        }

        // Create a HashSet to check for unique occurrences
        HashSet<Integer> occurrenceSet = new HashSet<>(frequencyMap.values());

        // If the number of elements in the HashSet is equal to the number of unique occurrences,
        // then all occurrences are unique
        return frequencyMap.size() == occurrenceSet.size();
        
    }
}