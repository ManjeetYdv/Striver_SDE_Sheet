class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        result[0]=0;
        result[1]=0;
        int k;
        for(int i=0 ;i<nums.length ;i++){
            int sum = target -nums[i];
            k=i+1;
            while(k<nums.length){
                if(nums[k]==sum){
                    result[0]=i;
                    result[1]=k;
                    return result;
                }
                else{
                    k++;
                }
            }
        }
        return result;
    }
}
