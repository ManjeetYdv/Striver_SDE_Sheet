package com.company;

public class kadane {

    public static int kadaneAlgo(int [] arr){
        int currSum =arr[0];
        int maxSum = arr[0];

        for(int i=1; i<arr.length ;i++){
            if(currSum>=0){
                currSum+=arr[i];
            }
            else{
                currSum= arr[i];
            }
            maxSum = Integer.max(currSum , maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={-9 , -8 ,2  , 5};
        System.out.println(kadaneAlgo(arr));
    }
}
