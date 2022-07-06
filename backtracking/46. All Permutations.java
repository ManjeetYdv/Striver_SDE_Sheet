
class Solution {
    
    List<List<Integer>> res;
    
    public void func(int[]nums , int index , List<Integer>list)
    {
        
        if(index==nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=index ; i<nums.length ; i++){
            
            Collections.swap(list ,index , i);
            func(nums , index+1 , list);
            Collections.swap(list , index , i);
        }
     }
    
  

            
    public List<List<Integer>> permute(int[] nums) {
        
        res = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        for(int i: nums){
          list.add(i);
        }
        
        func(nums , 0 , list);
        return res;
        
    }
}
