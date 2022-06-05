package com.company;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class NextPermutation {
    public static void nextPermutation(Vector<Integer> vector){

        int size= vector.size();
        int idx=-1;
        for(int i= vector.size()-1; i>=1 ;i--){
            if(vector.get(i)> vector.get(i-1)){
                idx =i;
                break;
            }
        }

        if(idx==-1){
            Collections.reverse(vector);
            return;
        }
        else{
            int prev=idx;
            for(int i=prev+1 ;i<vector.size();i++){
                if(vector.get(i)> vector.get(idx-1) && vector.get(i)<=vector.get(prev)){
                    prev=i;
                }
            }
            Collections.swap(vector , idx-1 , prev);
            vector= reverePortion(vector , idx-1 , vector.size()-1);
        }

    }

    public static Vector<Integer> reverePortion(Vector<Integer> xyz , int i , int j){
        Vector<Integer>  reversed = new Vector<>();

        for(int k=0 ;k<i ;k++){
            reversed.add(xyz.get(k));
        }
        for(int k=j ;k>=i ;k--){
            reversed.add(xyz.get(k));
        }
        return reversed;

    }

    public static void main(String[] args) {

        Vector<Integer> nums = new Vector<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element : ");
        String element = sc.next();

        int x;
        for(int i=0 ;i<element.length();i++){
             x = Character.getNumericValue(element.charAt(i));
             nums.add(x);
        }
      nextPermutation(nums);

        for(int i=0 ;i< nums.size();i++){
            System.out.print(nums.get(i));
        }


    }
}
