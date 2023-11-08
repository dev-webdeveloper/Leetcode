class RecentCounter {

    private Queue<Integer> requests;

    
    public RecentCounter() {
        
        requests = new LinkedList<>();
        
    }

    public int ping(int t) {
        
        // Add the current timestamp to the queue
        requests.add(t);

        // Remove the older requests that are outside the time frame of 3000 milliseconds (3 seconds)
        while (requests.peek() < t - 3000) {
            
            requests.poll();
            
        }

        // Return the size of the queue which represents the number of requests within the last 3000 milliseconds
        return requests.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */