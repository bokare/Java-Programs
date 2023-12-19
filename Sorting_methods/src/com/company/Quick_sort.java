package com.company;

import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1} ;
        quicksort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void quicksort(int[] arr,int low,int high){
        if(low>=high){
            return ; //  means now array is sorted
        }
        //initially
        int s = low ;
        int e = high ;
        int m = s+(e-s)/2 ;
        int pivot = arr[m] ;

        while(s<=e){

            while(arr[s]<pivot){  //it will stop s where that element is not less than pivot
                s++;
            }
            while(arr[e]>pivot){   //it will stop e where that element is not greter than pivot
                e--;
            }
            //once violation is found in s and e element swap them
            while(s<=e){
                int temp = arr[s] ;
                arr[s] =arr[e] ;
                arr[e] =temp ;
                s++;
                e--;

            }

        }
        //now our pivot is at correct position now sort left and right part of pivot
        quicksort(arr,low,e);
        quicksort(arr,s,high) ;

    }
}
