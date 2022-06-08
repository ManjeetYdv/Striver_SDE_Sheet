class Solution {
    
 
    public int findDuplicate(int[] arr) {
        
//          HashMap<Integer , Integer> exists = new HashMap<>();

//         for(int i=0 ;i<arr.length ;i++){
//             exists.put(arr[i] , 0);
//         }
//         int repeat = 0;
//         for(int i=0 ;i<arr.length ;i++){
//             if(exists.get(arr[i])==0){
//                 exists.put(arr[i] , 1);
//             }
//             else {
//                 repeat = arr[i];
//                 break;
//             }
//         }
//         return repeat;
        
        int slow = arr[0];
        int fast = arr[0];
        
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
            
        }while(slow!=fast);
        
        fast = arr[0];
        
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[fast];
            
        }
        return slow;
    }
}
