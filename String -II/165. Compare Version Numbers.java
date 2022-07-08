class Solution {
    
    
    public  int compare(String[]v1 , String[]v2){
        
        int minL = Integer.min(v1.length , v2.length);
            for(int i=0 ;i<minL ;i++){
                 if((Integer.parseInt(v1[i]) > Integer.parseInt(v2[i]))) return 1;
                 if((Integer.parseInt(v1[i]) < Integer.parseInt(v2[i]))) return -1;
         }
    
         
        if(v1.length>v2.length){
            for(int i=v2.length ; i<v1.length ;i++){
                if(Integer.parseInt(v1[i])!=0){
                     return 1;
                   
                }
            }
        }
        
        else if(v2.length>v1.length){

            for(int i=v1.length ;i<v2.length ;i++){
                if(Integer.parseInt(v2[i])!=0){
                   return -1;
                }
            }
        }
        
      return 0;

        
    }
    public int compareVersion(String version1, String version2) {
        
         String[]v1  = version1.split("[.]");
         String[]v2  = version2.split("[.]");
        
        return compare(v1 , v2);
        
        
        
        
    }
}
