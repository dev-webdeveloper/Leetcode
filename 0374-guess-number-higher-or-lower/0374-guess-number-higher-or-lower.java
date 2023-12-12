/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int low = 1;
        
        int high = n;

        while (low <= high) {
        
            int mid = low + (high - low) / 2;
            
            int result = guess(mid);

            if (result == 0) {
            
                return mid; // Found the correct guess
            
            } else if (result == 1) {
            
                low = mid + 1; // Adjust the range for a lower guess
            
            } else {
            
                high = mid - 1; // Adjust the range for a higher guess
         
            }
        }

        return -1; // This should not happen if the input is correct
    }
}