package com.company;

import java.util.HashMap;

public class maxK {

    public static void main(String[] args) {

        int[] arr ={19 , 3,1  , 1};
        int k=3;

        int maxLen=0;

        int prefix_sum =0;

        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 , -1);            //handles cases when prefix_sum==k

        for(int i=0 ;i<arr.length ;i++){

            prefix_sum +=arr[i];

            if(map.containsKey(prefix_sum-k)){
                 maxLen = Integer.max(maxLen , i-map.get(prefix_sum-k));
            }
            
           
            map.put(prefix_sum , i);
            

        }

        System.out.println(maxLen);
    }
}
