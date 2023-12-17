package com.company;

import java.util.Arrays;

public class M2_copyOf{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5} ;
        int[] arr2 = Arrays.copyOf(arr,2) ;
        int[] arr3 = Arrays.copyOfRange(arr,0,3) ;
        System.out.println(Arrays.toString(arr3));

        System.out.println(Arrays.compare(arr2,arr));
        System.out.println(Arrays.compare(arr,arr2));
    }
}
