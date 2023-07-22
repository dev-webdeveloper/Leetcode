// The problem is to determine if a given integer is a palindromic number. 
// Palindrome numbers are read from the front or from the back, but they are the same number.

class Solution {
    public boolean isPalindrome(int x) {
    
        //creates a new instance of the  StringBuffer class and assigns it to the variable pd.
         StringBuffer sb = new  StringBuffer();
            
        //The variable a should be a character, and it is appended to the pd object.
        sb.append(x);

        //converts the pd object to a string representation by calling the toString() method. 
        String s = sb.toString();

        //If the reversed version of the sb object (obtained by calling reverse()) is equal to the original sb object represented as a string (s). If they are equal, it means the  StringBuffer is the same forward and backward, and the method will return true. Otherwise, it returns false.
              
        if(sb.reverse().toString().equals(s))
        {

            return true;

        }else{

            return false;

        }
        
    }
}


