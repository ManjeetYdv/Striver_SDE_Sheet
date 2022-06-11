class Solution {
    public int maxProduct(int[] arr) {
        
        int currP = 1;
        int maxP = Integer.MIN_VALUE;
        
        for(int i=0 ;i<arr.length ;i++){
            
            currP =currP*arr[i];
            maxP = Integer.max(currP , maxP);
            
            if(currP==0){
                currP=1;
            }
        }
        currP=1;
        
         for(int i=arr.length-1 ;i>=0 ;i--){
            
            currP =currP*arr[i];
            maxP = Integer.max(currP , maxP);
            
            if(currP==0){
                currP=1;
            }
        }
        
        return maxP;
        
    }
}
