class Solution {
    
    List<List<Integer>> res;
    
    public void func(int[] arr , int idx , int target  , List<Integer>list){
        
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=idx ;i<arr.length ;i++){
            
           if(i!=idx && arr[i]==arr[i-1]) continue;
           
            if(arr[i]>target){
                break;
            }
            
            list.add(arr[i]);
            func(arr ,i+1  , target-arr[i] , list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        
        func(candidates , 0 , target , new ArrayList<>());
        
        
        
        
        return res;
        
    }
}
