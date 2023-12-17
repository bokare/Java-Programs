package com.company;

import java.util.Arrays;

public class M3_deepEquals {
    public static void main(String[] args) {
//        DeepEquals method would return true in case the two mentioned arrays
//        are deeply equal to the other array or not.

        int[][] arr = {{1,2,3,4}} ;
        int[][] arr2 = {{1,2,3,4}} ;
        System.out.println(Arrays.deepEquals(arr,arr2)); // true
        System.out.println(arr==arr2);  // false

        int[] ar3 = {1,2} ;
        int[] ar4 = {1,2} ;
        System.out.println(ar3.equals(ar4)); //  false

    }
}
