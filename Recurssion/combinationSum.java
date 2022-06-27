class Solution {
    
     List<List<Integer>> res;

       public void func(int[]arr ,int index , int target  , List<Integer> list){

           if(index==arr.length){
               if(target==0){
                   res.add(new ArrayList<>(list));
               }
           return;
          }

           if(arr[index]<=target){
               list.add(arr[index]);
               func(arr ,index , target-arr[index]  , list);
               list.remove(list.size()-1);
             }
           func(arr , index+1 ,target , list);

        }
    
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        
        res = new ArrayList<>();
 
        func(arr , 0 , target , new ArrayList<>());
        return res;
    }
}
