package com.company;

import java.util.Arrays;
import java.util.Vector;

public class nMeetings {


    public static int maxMeetings(int[] start , int[]end  , int n){

        Vector<Integer> vector = new Vector<>();

        int[][]arr = new int[n][3];
        for(int i=0 ;i< n;i++){
            arr[i][0]=start[i];
            arr[i][1]=end[i];
            arr[i][2] =i+1;
        }
        Arrays.sort(arr ,(a ,b )->a[1]-b[1]);         //Sorting according to end time of meetings

        int last=0;
        int maxMeets=0;

        for(int[]i:arr){

            if(i[0]>last){
                maxMeets++;
                last=i[1];
                vector.add(i[2]);
            }
        }

        System.out.print("Meeting that will be held : ");           //One based
        for(int i:vector){
            System.out.print(i+" ");
        }
        System.out.println();

        return maxMeets;
    }
    public static void main(String[] args) {

      int[] start = {1,3,0,5,8,5};
       int[] end =  {2,4,6,7,9,9};

       int size= start.length;

        System.out.println(maxMeetings(start ,end  , size));
    }
}
