class Solution {

     
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[2];
        int i =0;
        int j =nums.length-1;
        
        res[0] = -1;
        res[1] = -1;
        
        while(i<=j){
            
            int mid = i + (j-i)/2;
            
            if(nums[mid] == target){
                res[0] = mid;
                j = mid-1;      //to break the loop
            }
            else if(nums[mid] > target) j = mid-1;
            else i = mid+1;
        }
        
        i=0;
        j=nums.length-1;
        
        while(i<=j) {
            
            int mid = i + (j-i)/2;
            
            if(nums[mid]==target){
                res[1] = mid;
                i = mid+1;     //to break the loop
            }
            else if(nums[mid] > target) j = mid-1;
            else i = mid+1;
            
        }
        
        return res;
}
}
     // If the target exists, returns its leftmost index.
    // Else, returns the index of where it should be.
    // To get the last occurance of element  , return binarySearch(nums , target+1)-1
     //not using here coz it returns possible position if element dont exist not -1
    //  public int binarySearch(int[]nums , int target){     
        
    //    int l=0;
    //    int r=nums.length;
       
    //    while(l<r){
    //        int m = (l+r)/2;
    //        if(nums[m]<target) l=m+1;
    //        else r=m;
    //    }
    //    return l;
    // }
