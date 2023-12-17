package com.company;

//  A clone of a multi-dimensional array (like Object[][]) is a “shallow copy,” however, which is to say that it
//  creates only a single new array with each element array a reference to an original element array,
//  but subarrays are shared.

public class cloneIn_2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                       {4,5,6},
                        {7,8,9}} ;
        int[][] arr2 = arr.clone() ;
        System.out.println(arr==arr2);   //  false
        System.out.println(arr[0] == arr2[0]);          // true    ***      called shallow copy
        System.out.println(arr[1] == arr2[1]);          // true
        System.out.println(arr[2] == arr2[2]);          // true

        arr[0][0] = 100;   //  ***  will also change in arr2   ; called shallow copy
        System.out.println(arr2[0][0]);  // 100
    }
}
