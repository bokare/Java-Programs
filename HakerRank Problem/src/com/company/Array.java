package com.company;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5} ;
        String[] ar = {"hello" ,"worls "} ;
        genericArray(ar);
        fun2(ar);

    }

    // method 1
    static <T> void genericArray(T[] arr){
        System.out.println(Arrays.toString(arr));

    }

    //  method 2
    static void fun2(Object[] arr){
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

    }
}
