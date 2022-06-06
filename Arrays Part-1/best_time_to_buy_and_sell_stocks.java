package com.company;

public class best_time_to_buy_and_sell_stock {

    public static int maxProfit(int[]arr){
        int least_till_now = Integer.MAX_VALUE;
        int maxProfit =0;
        int todayProfit=0;

        for(int i=0 ;i<arr.length ; i++){
            if(arr[i]<least_till_now){
                least_till_now = arr[i];
            }
           todayProfit = arr[i]-least_till_now;
            maxProfit = Integer.max(maxProfit ,todayProfit);
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[]arr ={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}
