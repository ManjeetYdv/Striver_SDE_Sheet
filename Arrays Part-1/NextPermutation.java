class Solution {
    
   public static void revereseArray(int arr[], int start, int end) {
            while (start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
       return;
       } 
    
    public void swap(int arr[] , int x , int y){
        int temp = arr[y];
        arr[y]=arr[x];
        arr[x] = temp;
        return;
    }
    public void nextPermutation(int[] arr) {
        
        
        int idx =-1;
        for(int i=arr.length-1 ;i>=1 ;i--){
            
            if(arr[i]>arr[i-1]){
                idx = i;
                break;
            }
        }
        
        if(idx==-1){
            revereseArray(arr , 0 , arr.length-1);
            return;
        }
        
        int prev =idx;
        
        for(int i=idx ;i<arr.length ;i++){
            
            if(arr[i]>arr[idx-1] && arr[i]<=arr[prev]){
                prev=i;
            }
        }
        swap(arr , idx-1 , prev);
        revereseArray(arr , idx , arr.length-1);
        
        
    }
}
