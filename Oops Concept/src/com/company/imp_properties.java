package com.company;

import java.util.Arrays;

public class imp_properties {
    public static void main(String[] args) {
        // *** 1 ***
        // making change via one reference variable make change in another reference varible also
        // pointing towards same object in heap memory
       int[] arr = {1,2,3,4} ;
       int[] arr2 = arr ;    // arr and arr2 are pointing toward same object
       arr[0] = 100 ;
       System.out.println(Arrays.toString(arr2));

//      *** 2 ***
       // in java everything is pass by value not by reference
        int a = 10 ;
        int b = 20 ;
//        int temp = a ;
//        a= b ;
//        b = temp ;
//        System.out.println(a+" "+b);  // 20 10
        swap(a,b);
        System.out.println(a+" "+b);  // 10 20

        // *** 3 ***
        final String name = " vaibhav " ;
        //name = "mc" ;    primitive cannot modify or re assign

        final int[] ar = {1,2,3,4};
        // ar = {4,5,6} ;  // non-primitive cannot reassign object if final
        ar[0]= 100 ;  // but can be modified even if final



    }
    static void swap(int a, int b){  // just pass by value 10,20
        int temp = a ;
        a= b ;
        b = temp ;
        //System.out.println(a+" "+b);  // 20 10
    }
}
