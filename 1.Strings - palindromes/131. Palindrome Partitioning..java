class Solution {
    
    List<List<String>> res;
    
    
    
    public void func(String s , int index , List<String> list){
        
        if(index==s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i =index ;i<s.length() ;i++){
            
            if(isPalindrome(s , index , i)){
                
                list.add(s.substring(index ,i+1));
                func(s , i+1 ,list);
                list.remove(list.size()-1);
            
            }
        }
        
    }
   
   
    public List<List<String>> partition(String s) {
        
        res = new ArrayList<>();
        func(s,  0,  new ArrayList<>());
        return res;
        
        
    }
    
    
      public boolean isPalindrome(String str , int start , int end){
        
        while(start<=end){
            
            if(str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
