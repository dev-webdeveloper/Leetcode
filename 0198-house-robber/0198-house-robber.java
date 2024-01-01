class Solution {
    public int rob(int[] nums) {
        
        if (nums == null || nums.length == 0) {
            
            return 0;
        }

        int n = nums.length;

        // Handle the base cases when there are only one or two houses
        if (n == 1) {
            
            return nums[0];
            
        }

        if (n == 2) {
            
            return Math.max(nums[0], nums[1]);
        }

        // Initialize an array to store the maximum robbed amount up to the i-th house
        int[] dp = new int[n];
        
        dp[0] = nums[0];
        
        dp[1] = Math.max(nums[0], nums[1]);

        // Iterate through the houses and calculate the maximum robbed amount
        for (int i = 2; i < n; i++) {
            
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
            
        }

        // The final result is stored in the last element of the dp array
        return dp[n - 1];
    }
}