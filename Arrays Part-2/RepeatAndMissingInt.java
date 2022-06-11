class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
         int[] a = new int[2];
        int[] count = new int[n+1];
        
        for(int i=0 ;i<n ;i++){
            count[arr[i]]++;
        }
        for(int i=1 ;i<=n ;i++){
            if(count[i]==2){
                a[0]=i;
            }
            if(count[i]==0){
                a[1]=i;
            }
        }
        return a;
    }
}
