package com.company;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class subArr_Sum_zero{


    public static boolean ArrSumZero(int[] arr){

        HashMap<Integer , Integer > map = new HashMap<>();

        int sum=0;
        for (int j : arr) {
            sum += j;
            if (sum == 0 || j == 0 || map.containsKey(sum)) {
                return true;
            } else {
                map.put(sum, 1);
            }

        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr={  1 , 3};

        System.out.println(ArrSumZero(arr));


    }
}
