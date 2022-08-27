package com.company;

import java.util.TreeSet;

public class maxSumSubarrWithSum_atmost_k {

    static int subarrk(int []arr,  int k){
        
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        int max = Integer.MIN_VALUE;
        int prefix_sum=0;
        
        for(int i =0 ;i<arr.length ;i++){
            prefix_sum+=arr[i];
            
            Integer target = set.ceiling(prefix_sum-k);
            
            if(target!=null){
                max = Integer.max(max , prefix_sum-k);
            }
            set.add(prefix_sum);
        }
        return max;
    }
    public static void main(String[] args) {
        
    }
}
