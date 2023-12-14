class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
      
        // Get the lengths of spells and potions arrays
        int n = spells.length;
     
        int m = potions.length;

        // Initialize an array to store the count of successful pairs for each spell
        int[] pairs = new int[n];

        // Sort the potions array in ascending order
        Arrays.sort(potions);

        // Iterate through each spell
        for (int i = 0; i < n; i++) {
           
            // Get the strength of the current spell
            int spell = spells[i];

            // Initialize pointers for binary search
            int left = 0;
           
            int right = m - 1;

            // Binary search to find the position where the product of spell and potion is >= success
            while (left <= right) {
             
                // Calculate the middle index
                int mid = left + (right - left) / 2;

                // Calculate the product of the current spell and potion
                long product = (long) spell * potions[mid];

                // Adjust pointers based on the result of the comparison
                if (product >= success) {
           
                    right = mid - 1;
           
                } else {
           
                    left = mid + 1;
              
                }
            }

            // The count of successful pairs is determined by the difference between total potions and the current left position
            pairs[i] = m - left;
      
        }

        // Return the array containing the count of successful pairs for each spell
        return pairs;
       
    }
}