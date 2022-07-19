class Solution {
    
    
    int expandFromCenter(String s , int i , int j){
        int count=0;
        while(i>=0 && j<s.length() && s.charAt(i--)==s.charAt(j++)){

            count++;
        }
        return count;
    }


    public int countSubstrings(String str) {
      
       if(str.length()==0) return 0;
       int res=0;
 
        for(int i=0 ;i<str.length() ;i++){
            res+=expandFromCenter(str ,i , i);
            res+=expandFromCenter(str ,i , i+1);
        }
         return res;
     }
    
}
