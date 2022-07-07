import java.util.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
public class Solution {
    public static ArrayList<Integer> stringMatch(String str, String pat) {
     ArrayList<Integer> list = new ArrayList<>();

        int target=0;
        for(int i=0 ;i<pat.length();i++){
            target+= pat.charAt(i)-'A'+1;
        }

       
        
        //prefix sum 
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(-1 , 0);
        int prefixSum=0;
        for(int i=0 ;i<str.length();i++){
            prefixSum+= str.charAt(i)-'A'+1;
            map.put(i ,prefixSum);
        }

        for(int i=0 ;i<=str.length()-pat.length() ;i++){
            if(map.get(i+pat.length()-1)-map.get(i-1)==target){
               if(str.substring(i ,i+pat.length()).equals(pat)){
                    list.add(i);
                }
            }
        }

        return list;
    }
}
