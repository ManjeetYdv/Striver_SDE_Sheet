class Solution {
    public int maxSubArray(int[] arr) {
         int currSum =arr[0];
         int maxSum = arr[0];

        for(int i=1; i<arr.length ;i++){
            if(currSum>=0){
                currSum+=arr[i];
            }
            else{
                currSum= arr[i];
            }
            maxSum = Integer.max(currSum , maxSum);
        }
        return maxSum;
    }
}
