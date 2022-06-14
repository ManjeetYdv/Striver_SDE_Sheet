
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long , Integer> map = new HashMap<>();
        
        for(int i=0 ;i<a1.length;i++){
            
            map.put(a1[i] ,1);
        }
        boolean flag= true;
        for(int i=0 ;i<a2.length ;i++){
            
            if(!map.containsKey(a2[i])){
                flag=  false;
                break;
            }
            
        }
        
        return flag ==true?"Yes": "No";
    }
}
