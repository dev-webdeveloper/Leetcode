class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        // Create a min-heap
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add elements to the min-heap
        for (int num : nums) {
            
            minHeap.offer(num);

            // If the size of the min-heap exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                
                minHeap.poll();
                
            }
        }

        // The remaining element at the top of the min-heap is the kth largest
        return minHeap.poll();

    }
}