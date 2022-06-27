package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {

    static void func(int[]arr , int idx , int sum , int N , ArrayList<Integer>subsetSum){
        if(idx==N){
            subsetSum.add(sum);
            return;
        }
        func(arr ,idx+1 ,sum+arr[idx] , N , subsetSum);
        func(arr , idx+1 , sum , N , subsetSum);

    }


    static ArrayList<Integer>subsetSums(int[]arr){

        ArrayList<Integer> subsetSum = new ArrayList<>();
        func(arr , 0 , 0 ,arr.length , subsetSum);
        Collections.sort(subsetSum);
        return subsetSum;



    }
    public static void main(String[] args) {

        int[]arr ={1 ,2 ,3 };
        ArrayList<Integer>res = subsetSums(arr);

        System.out.print("Subset sums : ");
        for(int i: res){
            System.out.print(i+" ");
        }

    }
}
