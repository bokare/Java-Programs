package com.company;

import java.util.Arrays;

public class arr_equality {
    public static void main(String[] args) {
        int[] arr = {1,2,3} ;
        int[] ar = {1,2,3} ;


        String a = "a" ;
        String b = "a" ;
        System.out.println(a==b);  //  true
        System.out.println(a.equals(b));
        System.out.println(arr==ar);  // false
        System.out.println(Arrays.equals(arr,ar));  // true
    }


}
