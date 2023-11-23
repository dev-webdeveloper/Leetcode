class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;  // Initialize the maximum altitude to 0.
        
        int currentAltitude = 0;  // Initialize the current altitude to 0.

        for (int g : gain) {
            
            currentAltitude += g;  // Update the current altitude by adding the gain.

            // Update the maximum altitude if the current altitude is greater.
            if (currentAltitude > maxAltitude) {
                
                maxAltitude = currentAltitude;
                
            }
        }

        return maxAltitude;  // Return the maximum altitude reached.
    }
}