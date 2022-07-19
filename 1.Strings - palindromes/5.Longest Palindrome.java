class Solution {
    
    public int ExpandFromCenter(String s ,int i , int j){
        
        while(i>=0 && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }
            else{
                break;
            }
        }
        
        return j-i-1;
    }
    public String longestPalindrome(String s) {
        
        if(s.length()==0) return s;
        
        int start=0;
        int end=0;
    
        
        for(int i=0 ;i<s.length();i++){
            
            int l1 = ExpandFromCenter(s , i ,i);
            int l2 = ExpandFromCenter(s , i , i+1);
            
            int len = Math.max(l1, l2);
            
            if((end-start)<len){
                
                start= i-(len-1)/2;
                end = i+len/2;
            }
        }
        
        return s.substring(start , end+1);
        
        
    } 
}
