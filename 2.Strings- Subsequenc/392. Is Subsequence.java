class Solution {
    public boolean isSubsequence(String s, String t) {
     
        if(s.length()==0) return true;
        if(t.length()==0) return false;
        
        int idx=0;
        Character c =s.charAt(idx);
        
        for(int i= 0; i<t.length() ;i++ ){
            
            if(c==t.charAt(i)){
                
                idx++;
                if(idx==s.length())return true;
                c = s.charAt(idx);
            }
          
        }
        
        return false;
    }
    
}
