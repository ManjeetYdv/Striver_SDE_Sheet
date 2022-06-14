class Solution {
    
    static List<List<Integer>> res;
    
    public List<List<Integer>> threeSum(int[] arr) {
        
        
        res = new ArrayList<>();
        
        if(arr.length<=2){
            return res;
        }
         
         Arrays.sort(arr);
         
        for(int i=0 ;i<=arr.length-3 ;i++){
            
            if(i==0 || arr[i]!=arr[i-1]){               // avoid duplicate of i
                int target = 0-arr[i];                  // i+j+k = 0 ; ,hence need to find , j+k = target = 0-i ;
                twoSum(i+1 , target , arr);
            }
            
        }
        
        return res;
        
         
        
    }
    
    static void twoSum(int start , int target , int[] arr){
        
        
        int i=start;
        int j=arr.length-1;
        while(i<j){
            
            int sum = arr[i] + arr[j];
            
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            
            else {
                 //Avoiding duplicates of i and j
                while(i<j && arr[i]==arr[i+1]){
                    i++;
                }
                while(i<j && arr[j]==arr[j-1]){
                    j--;
                }
                
                List<Integer> list = new ArrayList<>();
                list.add(arr[start-1]);
                list.add( arr[i]);
                list.add( arr[j]);
                res.add(list);
                
                i++;
                j--;
            }
           
            
            
            
        }
        }
}
