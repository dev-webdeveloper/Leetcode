class Solution {
    public int[] twoSum(int[] nums, int target) {

      
            for (int i=0; i<nums.length; i++){
                
                for ( int j=i+1; j<nums.length; j++){

                if(nums[i]+nums[j]==target){


                        return new int[]{i,j};

                }

            }        
        
        }
        
         return new int[]{}; 


    }


        //This algorithm finds two indices whose sum is equal to the target value. 
        //First, it uses a for loop to find pairs of numbers whose sum is equal to the target. 
        //When such a pair is found, it stops. 
        //Finally, it returns the index numbers
}