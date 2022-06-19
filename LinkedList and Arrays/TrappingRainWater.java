class Solution {
    public int trap(int[] arr) {
        
        int n=arr.length;
        int []left = new int[n];
        int []right= new int[n];

        left[0]=arr[0];
        right[n-1] =arr[n-1];

        for(int i=1 ;i<n ;i++){
            left[i] = Math.max(left[i-1] , arr[i]);
        }

        for(int i=arr.length-2 ;i>=0 ;i--){
            right[i] = Math.max(right[i+1] ,arr[i]);
        }

        int water=0;

        for(int i=1 ;i<arr.length-1 ;i++){

            int var = Math.min(left[i-1] , right[i+1]);
            if(var>arr[i]){
                water += (var-arr[i]);
            }
        }

        return water;
    }
}
