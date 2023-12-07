class SmallestInfiniteSet {

    private Integer minNum;          // Variable to track the smallest number not in the heap
    
    private PriorityQueue<Integer> heap;  // Priority queue to store numbers greater than minNum

    public SmallestInfiniteSet() {

        minNum = 1;                   // Initialize minNum to 1
        
        heap = new PriorityQueue<>(); // Initialize the heap
    }

    // Method to pop the smallest element from the set
    public int popSmallest() {
        
        if (!heap.isEmpty()) {
        
            // If the heap is not empty, pop and return the smallest element from the heap
            return heap.poll();
        
        }
        
        // If the heap is empty, increment minNum and return the previous minNum
        minNum++;
        
        return minNum - 1;
    }

    // Method to add an element back to the set
    public void addBack(int num) {
        
        // Check if the given number is less than minNum and not already in the heap
        if (minNum > num && !heap.contains(num)) {
        
            // Add the number to the heap
            heap.offer(num);
       
        }
    }     
    
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */