class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int n = nums.length;
        
        int sum = 0;

        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            
            sum += nums[i];
            
        }

        double maxAverage = (double) sum / k;

        // Slide the window and calculate the average for each subarray
        for (int i = k; i < n; i++) {
            
            sum += nums[i] - nums[i - k]; // Update the sum by removing the leftmost element and adding the rightmost element
            
            double average = (double) sum / k;
            
            maxAverage = Math.max(maxAverage, average);
            
        }

        return maxAverage;
    }
}