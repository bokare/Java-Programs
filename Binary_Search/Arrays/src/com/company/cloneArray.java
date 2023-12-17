package com.company;

public class cloneArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5} ;
        int[] arr2 = arr ;
        change(arr);
        System.out.println(arr2[0]);  // 100  in arr2 will also chang

        //  ****   DEEP COPY  ****

        int[] ar = {1,2,3,4,5} ;
        int[] ar2 = ar.clone();     // create new object and copy of all element of existing array
        change(ar) ;        //  will not change in ar2
        System.out.println(ar[0]);
        System.out.println(ar2[0]);

    }
    static void change(int[] arr){
        arr[0] = 100 ;
    }

}
