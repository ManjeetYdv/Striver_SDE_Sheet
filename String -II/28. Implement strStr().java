class Solution {
    public int strStr(String str, String s) {
        
         for(int i=0 ;i<=str.length()-s.length() ;i++){
            String temp="";
            for(int j=0 ;j<s.length() ;j++){
                temp+=str.charAt(i+j);
            }
            if(temp.equals(s)) return i;

        }
        return -1;
    }
}
