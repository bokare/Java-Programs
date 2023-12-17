package com.company;
import java.util.Arrays;

public class Q5_chocalate_distubution {
    public static void main(String[] args) {
        //int[] arr= {12,4,7,9,2,23,25,41,30,40,28,42,30,44,48,43,50}; //when m=7 output = 10 ;
        int[] arr= {7,3,2,4,9,12};
        min_diff(arr,3);
        min_diff2(arr,3);
    }

    static void min_diff(int[] arr,int m){
        if(arr.length==0||m==0){
            System.out.println(0);
            return;
        }
        Arrays.sort(arr);
        int min= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+m-1;j<arr.length;j++){
                int diff= arr[j]-arr[i] ;
                if(diff<min){
                    min=diff;
                }
            }
        }
        System.out.println(min);
    }

    static void min_diff2(int[] arr,int m) {
        if (arr.length == 0 || m == 0) {
            System.out.println(0);
            return;
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-m; i++) {

            int diff = arr[i + m - 1] - arr[i];
            if (diff < min) {
                min = diff;
            }
        }
        System.out.println(min);
    }
}

