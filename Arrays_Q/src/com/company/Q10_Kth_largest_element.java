package com.company;

import java.util.Arrays;

public class Q10_Kth_largest_element {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4,8,2,8};
        int k = 2 ;
        System.out.println(largest(arr,k));
    }

    static int largest(int[] arr,int k){
        Arrays.sort(arr)   ;      //USE CYCLIC SORT OR ANY SORTING METHOD HERE
        return arr[arr.length-k];  //take care of if any int reperted in array
    }
}
