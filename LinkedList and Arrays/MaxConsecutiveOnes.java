class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     
        int currOnes =0;
        int maxOnes =0;
       for(int i=0 ;i<nums.length ;i++){
           
           if(nums[i]==1){
               currOnes++;
           }
           else{
               currOnes=0;
           }
           maxOnes = Integer.max(currOnes , maxOnes);
       }
        return maxOnes;
    }
}
