class Solution {
    
    public int majorityElement(int[] nums) {
        
        
        //Boyer-Moore's Voting Algorithm
        int count=0;
        int ans=0;
        
        for(int i=0 ;i<nums.length ;i++){
            
            if(count==0){
                ans=nums[i];
                count++;
            }
            else if(nums[i]==ans){
                count++;
            }
            else{
                count--;
            }
        }
        
        return ans;
    }
}
