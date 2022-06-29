class Solution {
    List<List<Integer>> res;
     
    
    public void func(int[] arr, int index , List<Integer> list){
        
        if(index==arr.length){
            res.add(new ArrayList<>(list));
            return;
        }
        
        list.add(arr[index]);
        func(arr , index+1  , list);
        list.remove(list.size()-1);
        
        func(arr , index+1 ,list);
        
        
        
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        
         res = new ArrayList<>();
        
        func(nums  ,0 , new ArrayList<>());
        
        return res;
    }
}
