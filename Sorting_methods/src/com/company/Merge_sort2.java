package com.company;

import java.util.Arrays;
// by chaning the original array

public class Merge_sort2 {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1,8} ;
        mergesort(arr,0, arr.length);

       // int [] ans = mergesort(arr,0, arr.length-1) ;
       // System.out.println(Arrays.toString(ans)); //it will not change the original array arr but create new one
        System.out.println(Arrays.toString(arr)); //in this we cteate mix and store to ans
    }

    static void mergesort(int[] arr,int start,int end) {
        if(end-start==1){
            return ;
        }
        int mid = start+(end-start)/2;
         mergesort(arr,start ,mid) ;
         mergesort(arr,mid, end);
         merge(arr,start,end,mid) ;
    }

    static void merge(int[] arr ,int start, int end,int mid) {
        int[] mix = new int [end-start] ;
        int i=start ;
        int j=mid ;
        int k=0 ;
        while(i<mid && j< end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i] ;
                i++;
            }else{
                mix[k] = arr[j] ;
                j++ ;
            }
            k++ ;
        }
        // it may happen that one array is not complete and there is some elements are remaining ;
        while(i < mid){
            mix[k] = arr[i] ;
            i++;
            k++;
        }
        while(j < end){
            mix[k] = arr[j] ;
            j++;
            k++;
        }
        //return arr ;
        for(int m= 0 ;m< mix.length; m++){
            arr[m+start]=mix[m] ;
        }
    }
}
