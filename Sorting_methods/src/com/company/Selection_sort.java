package com.company;
import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = { -4,-8,2,4,0,8,6,-7,1,78,52,46} ;
        selection(arr) ;
        System.out.println(Arrays.toString(arr));
    }
    static void selection (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find last index
            int last = arr.length - 1 - i;
            int maxIndex = getmaxindex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static int getmaxindex (int[] arr, int start, int end){
        int max = start ;
        for(int i = start ; i<=end ; i++){
            if(arr[max] < arr[i]){
                    max = i ;
            }
        }
        return max ;
    }
    static void swap (int[] arr , int first,int second){
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }

}
