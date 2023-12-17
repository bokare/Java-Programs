package com.company;

public class Q8_BestTimeToBuySell {
    public static void main(String[] args) {
        int[]arr= {15,4,2,7,8,3,1};
        System.out.println(maxProfit(arr));  // not applicable for all type of Arrays for ideal ans see next program
    }

    static int maxProfit(int[] arr) {
        int buyday = minIndex(arr);
        int sellday = maxIndex(arr,buyday);
        int profit = arr[sellday]-arr[buyday];
        return profit ;
    }
     static int minIndex(int[] arr){
        int min = 0;
        for(int i=1; i< arr.length ;i++){
            if(arr[i]<arr[min]){
                min=i ;
            }
        }
        return min ;
     }

    static int maxIndex(int[]arr,int start){
        int max = start;
        for(int i=start; i< arr.length ;i++){
            if(arr[i]>arr[max]){
                max=i ;
            }
        }
        return max ;
    }
}
