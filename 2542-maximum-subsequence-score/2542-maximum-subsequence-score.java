class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        
        // Get the length of nums1
        int n = nums1.length;

        // Create a 2D array 'aug' to store pairs (nums1[i], nums2[i])
        int[][] aug = new int[n][2];

        // Populate 'aug' with values from nums1 and nums2
        for (int i = 0; i < n; ++i) {
           
            aug[i][0] = nums1[i];
      
            aug[i][1] = nums2[i];
      
        }

        // Sort the 'aug' array based on the second column (nums2) in descending order
        Arrays.sort(aug, new Comparator<int[]>() {
         
            public int compare(int[] lhs, int[] rhs) {
         
                return -Integer.compare(lhs[1], rhs[1]);
         
            }
    
        });

        // Use a PriorityQueue to keep track of the top k elements from nums1
        PriorityQueue<Integer> pq = new PriorityQueue();

        // Initialize variables for the answer and total sum
        long ans = 0, total = 0;

        // Iterate through the sorted 'aug' array
        for (int i = 0; i < aug.length; ++i) {
           
            // Add the current element from nums1 to the total sum
            total += aug[i][0];

            // Add the current element from nums1 to the PriorityQueue
            pq.add(aug[i][0]);

            // If the size of the PriorityQueue exceeds k, remove the smallest element
            if (i >= k) total -= pq.poll();

            // If the index is at least k-1, calculate the current score and update the answer
            if (i >= k - 1) ans = Math.max(ans, total * aug[i][1]);
        
        }

        // Return the final answer
        return ans;
        
    }
}