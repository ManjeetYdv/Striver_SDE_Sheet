class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int minL = 200;
        
        for(String s : strs){
            minL = Integer.min(minL , s.length());
        }
        
        String prefix="";
        
        for(int i=0 ;i<minL; i++){
            
            for(int j=1 ;j<strs.length ;j++){
                
                if(strs[j].charAt(i)!=strs[j-1].charAt(i)){
                    return prefix;
                }
                
            }
            prefix+=strs[0].charAt(i);
        }
        
        return prefix;
    }
}
