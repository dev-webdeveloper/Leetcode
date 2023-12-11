class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
      
        // Initialize two pointers for the start and end of the costs array
        int i = 0;
        
        int j = costs.length - 1;

        // Create two priority queues to track the lowest costs from the beginning and end
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        // Initialize the total cost
        long ans = 0;

        // Continue the process until we hire k workers
        while (k-- > 0) {
          
            // Fill the first priority queue with candidates from the beginning
            while (pq1.size() < candidates && i <= j) {
          
                pq1.offer(costs[i++]);
           
            }
            
            // Fill the second priority queue with candidates from the end
            while (pq2.size() < candidates && i <= j) {
            
                pq2.offer(costs[j--]);
           
            }

            // Get the lowest cost from each priority queue
            int t1 = pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;
           
            int t2 = pq2.size() > 0 ? pq2.peek() : Integer.MAX_VALUE;

            // Choose the worker with the lower cost, update the total cost, and remove from the respective priority queue
            if (t1 <= t2) {
             
                ans += t1;
            
                pq1.poll();
           
            } else {
             
                ans += t2;
              
                pq2.poll();
            
            }
        }

        // Return the total cost to hire exactly k workers
        return ans;
    }
}