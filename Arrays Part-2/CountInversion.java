package com.company;

public class CountInversions {

    public static long merge(int[] arr , int l ,int mid , int r){

        int n1 =mid-l+1;
        int n2 = r-mid;
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];

        for(int i=0 ;i<n1; i++){
            a1[i]= arr[l+i];
        }
        for(int i=0 ;i<n2 ;i++){
            a2[i]=arr[mid+1+i];

        }
        int i=0;
        int j=0;
        int k=l;
        long count =0;

        while(i<n1 && j<n2){

            if(a1[i]>a2[j]){
                arr[k++]=a2[j++];
                count+=n1-i;
            }
            else{
                arr[k++]=a1[i++];
            }
        }

        while(i<n1){
            arr[k++]=a1[i++];
        }
        while(j<n2){
            arr[k++]=a2[j++];
        }

        return count;
    }

    public static long mergeSort(int[] arr ,int l , int r){

        long inversions =0;

        if(l<r){

            int mid =(l+r)/2;
            inversions+=mergeSort(arr , l , mid);
            inversions+=mergeSort(arr, mid+1 , r);
            inversions+=merge(arr , l ,mid , r);

        }
        return inversions;



    }
    public static void main(String[] args) {

        int [] arr={1, 20, 6, 4, 5 };

        System.out.println(mergeSort(arr , 0 , arr.length-1));

    }
}
