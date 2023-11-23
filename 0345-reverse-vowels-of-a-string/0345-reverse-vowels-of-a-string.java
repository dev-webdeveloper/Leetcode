class Solution {
    public String reverseVowels(String s) {
        
        char[] charArray = s.toCharArray ();
        int left = 0;
        int right = s.length() - 1;
        
        while (left < right) {
            
            while (left < right && !isVowel(charArray[left])){
                left ++;
            }
            while (left < right && !isVowel(charArray[right])){
                right --;
            
        
            
        }
        
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
        
        right --;
        left ++;
    
        }
                return new String (charArray);

}
        
        private boolean isVowel (char c){
            
            c = Character.toLowerCase(c);
            
            return c =='a' || c=='e' || c=='o' || c=='i' || c=='u';
            
        
    }
}