package com.company;

public class sort0s1s2s {
    public static void main(String[] args) {
        int[] arr={0 ,1 , 2, 0 ,1 ,2 };

        sort0s1s2s(arr);

        for(int i=0 ;i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    
    }
    public  static void sort0s1s2s(int[] arr){

        int size = arr.length;

        int zeros =0;
        int ones =0;
        int twos =0;

        for(int i=0 ;i<size;i++){

            if(arr[i]==0){
                zeros++;
            }
            else if(arr[i]==1){
                ones++;
            }
            else{
                twos++;
            }
        }
        int k=0;
        for(int i=0 ;i<zeros ;i++){
            arr[k++]=0;
        }

        for(int i=0 ;i<ones ;i++){
            arr[k++]=1;

        }

        for(int i=0 ;i<twos ;i++){
            arr[k++]=2;
        }




    }


}
