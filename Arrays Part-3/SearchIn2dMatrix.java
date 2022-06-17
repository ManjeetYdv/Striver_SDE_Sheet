class Solution {
    
    
   public  int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;


    }
    public boolean searchMatrix(int[][] arr, int k) {
        int rowIdx =-1;
        for(int i=0 ;i<arr.length ;i++){

            if(arr[i][0]<=k && k<=arr[i][arr[i].length-1]){
                 rowIdx =i;
                break;
            }
        }

        if(rowIdx ==-1){
            return false;
        }

        int[] row = arr[rowIdx];
        int idx = binarySearch(row , 0 , row.length-1 , k);

        if(idx==-1) {
            return false;
        }

        return true;

    }
}
