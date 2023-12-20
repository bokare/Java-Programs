package com.company;
// ans is approximate to original ans
// for 80 % test case
import java.util.ArrayList;

public class Q18_Word_Wrap {
    public static void main(String[] args) {
        int[] nums = {3,2,2};
        int k = 4 ;
        System.out.println(find_cost(nums,k));
    }

    static double find_cost(int[] arr, int k){
         int sum =0 ;
         for(int i=0;i<arr.length-1;i++){
             sum = sum +arr[i] ;
         }
         int n= arr.length-1;
         int avg = k-2 ;
         double totalcost = 0 ;
         for(int i=0;i<arr.length-1;){
             int count =0;
             double cost=0;
             while(count<=avg){
                 count=count+arr[i];
                 if(count+arr[i+1]<=avg){
                     i++;
                     count++;
                 }else{
                     cost = (k-count)*(k-count);
                     break;
                 }
             }
             totalcost = totalcost + cost ;
             i++;
         }
         return totalcost ;
    }
}
