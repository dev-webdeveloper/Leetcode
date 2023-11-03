class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
         Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            
            // If the stack is empty or the asteroid is moving to the right, just add it to the stack
            if (stack.isEmpty() || asteroid > 0) {
                
                stack.push(asteroid);
                
            } else {
                
                // Asteroid moving to the left
                // Keep checking for collisions while the top of the stack is moving right
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroid)) {
                    
                    stack.pop(); // Destroy the rightward asteroid on top of the stack
                    
                }

                if (stack.isEmpty() || stack.peek() < 0) {
                    
                    stack.push(asteroid); // If the stack is empty or the top asteroid is also moving left, add the left-moving asteroid
                    
                } else if (stack.peek() == Math.abs(asteroid)) {
                    
                    stack.pop(); // If the left and right-moving asteroids are of the same size, destroy both
                    
                }
            }
        }

        // Convert the stack to the resulting array
        int[] result = new int[stack.size()];
        
        for (int i = stack.size() - 1; i >= 0; i--) {
            
            result[i] = stack.pop();
            
        }

        return result;
    }
}