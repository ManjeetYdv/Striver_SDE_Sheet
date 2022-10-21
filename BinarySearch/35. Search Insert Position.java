class Solution {
      // If the target exists, returns its leftmost index.
      // Else, returns the index of where it should be.
      // To get the last occurance of element  , return binarySearch(nums , target+1)-1
      public int binarySearch(int[]nums , int target){

       int l=0;
       int r=nums.length;

       while(l<r){
           int m = (l+r)/2;
           if(nums[m]<target) l=m+1;
           else r=m;
       }
       return l;
    }

    public int searchInsert(int[] nums, int target) {
        
        return binarySearch(nums , target);
    }
}
