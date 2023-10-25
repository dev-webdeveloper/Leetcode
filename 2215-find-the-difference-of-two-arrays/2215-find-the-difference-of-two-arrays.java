class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        // Create a list to store the differences
        List<List<Integer>> differences = new ArrayList<>();

        // Create two HashSet objects to store elements from nums1 and nums2
        Set<Integer> set1 = new HashSet<>();
        
        Set<Integer> set2 = new HashSet<>();

        // Add elements from nums1 to set1
        for (int num : nums1) {
            
            set1.add(num);
            
        }

        // Add elements from nums2 to set2
        for (int num : nums2) {
            
            set2.add(num);
            
        }

        // Create two additional HashSet objects to store unique elements
        Set<Integer> uniqueInNums1 = new HashSet<>(set1);
        
        Set<Integer> uniqueInNums2 = new HashSet<>(set2);

        // Remove common elements between uniqueInNums1 and set2
        uniqueInNums1.removeAll(set2);

        // Remove common elements between uniqueInNums2 and set1
        uniqueInNums2.removeAll(set1);

        // Convert the unique elements to ArrayList objects and add them to the differences list
        differences.add(new ArrayList<>(uniqueInNums1));
        
        differences.add(new ArrayList<>(uniqueInNums2));

        // Return the differences list containing two lists of unique elements
        return differences;
    }
}