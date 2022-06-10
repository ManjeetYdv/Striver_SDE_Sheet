package com.company;

import java.util.HashMap;

public class MaxSubarrayWithSum_k {

    public static void main(String[] args) {

        int[] arr ={1,2,3};
        int k=3;

        int maxLen=0;

        int prefix_sum =0;

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0 ;i<arr.length ;i++){

            prefix_sum +=arr[i];

            if(arr[i]==k && maxLen==0){
                maxLen =1;
            }
            if(prefix_sum ==k ){
                maxLen = i+1;
            }

            if(map.containsKey(prefix_sum-k)){

                maxLen = Integer.max(maxLen , i-map.get(prefix_sum-k));
            }
            else{

                map.put(prefix_sum , i);
            }
        }

        System.out.println(maxLen);
    }
}
