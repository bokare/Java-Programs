package com.company;

public class Q8_BestTimeToBuySell2 {
    public static void main(String[] args) {
        //int[]arr= {9,8,7,6,5,4};
        int[]arr= {15,4,2,7,8,3,1};
        System.out.println(profit(arr));
    }

    static int profit(int[]arr){
        int maxProfit = Integer.MIN_VALUE ;
        for(int i=0 ;i< arr.length ;i++){
            for(int j=i ;j< arr.length ;j++){
                if(arr[j]-arr[i]>maxProfit){
                    maxProfit = arr[j]-arr[i];
                }
            }
        }
        return maxProfit ;
    }
}
