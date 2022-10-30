class Solution {

    public int binarySerach(int[]nums , int target){
        //return leftmost elemen' index is present else return the index where it should be
        int l=0;
        int r=nums.length;

        while(l<r){
            int m = (l+r)/2;
            if(nums[m]<target) l=m+1;
            else r =m;
        }

        return l;
    }
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length==0) return new int[]{-1 , -1};
        int[] res = new int[2];
        res[0]=-1;
        res[1]=-1;

        int first = binarySerach(nums ,target);
        int last =  binarySerach(nums , target+1)-1;

        if(first<nums.length && nums[first]==target) res[0] = first;
        if(last>=0 && nums[last]==target) res[1]=last;

        return res;
       
  }
}
