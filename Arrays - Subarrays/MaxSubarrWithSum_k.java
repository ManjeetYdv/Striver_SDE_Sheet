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



//returning longest array with sum k
package Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class longest_subarr_with_sumK {

    public static List<Integer> maxSubArr(int []arr , int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0 ,-1);
        int start =0;
        int end=0;
        int len=0;
        int prefix_sum=0;
        for(int i=0 ;i<arr.length ;i++){
            prefix_sum+=arr[i];
            if(map.containsKey(prefix_sum-k)){
                int currLen = i - map.get(prefix_sum-k);
                if(currLen>len){
                    len=currLen;
                    start = map.get(prefix_sum-k);
                    end = i;
                }
            }
            map.put(prefix_sum , i);
        }
        List<Integer> list = new ArrayList<>();
        for(int i=start+1 ;i<=end ;i++){
            list.add(arr[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,1,1,1,1};
        List<Integer> list = maxSubArr(arr , 3);
        for(int ele : list) System.out.print(ele+" ");
    }
}
