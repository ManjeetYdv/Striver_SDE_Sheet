class Solution {

    List<List<Integer>> res;
    
    public void func(int[] arr, int index , List<Integer> list){
        
        res.add(new ArrayList<>(list));
        
        for(int i=index ; i<arr.length ; i++){
            
            if(i!=index && arr[i]==arr[i-1] ) continue;
            
            list.add(arr[i]);
            func(arr , i+1 , list);
            list.remove(list.size()-1);
            
        }
        
        
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        res = new ArrayList<>();
        Arrays.sort(nums);
        
        func(nums  ,0 , new ArrayList<>());
        
        
        return res;
        
        
    }
}
