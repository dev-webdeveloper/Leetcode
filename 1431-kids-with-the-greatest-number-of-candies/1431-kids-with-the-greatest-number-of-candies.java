class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        //Find the maximum number of candies among all kids.
        int maxCandies = 0;
        
        for (int candy : candies) {
            
            maxCandies = Math.max(maxCandies, candy);
            
        }
        
        //Initialize a list to store the results.
        List<Boolean> result = new ArrayList<>();
        
        //Iterate through each kid's candies and check if they can have the most candies.
        for (int candy : candies) {
            
            boolean canHaveMostCandies = (candy + extraCandies) >= maxCandies;
            
            result.add(canHaveMostCandies);
            
        }
        
        //Return the list of booleans indicating whether each kid can have the most candies.
        return result;
    }
}