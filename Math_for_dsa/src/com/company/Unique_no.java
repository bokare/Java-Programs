package com.company;

public class Unique_no {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,1,2,3} ;
        System.out.println(unique(arr));
    }
    static int unique(int[] arr){
        int uni = 0 ;
        for(int i = 0; i<arr.length ; i++){
            uni^=arr[i] ;
            // any no xor with itsef give 0 And xor with 0 give that no.
        }
        return uni ;
    }
}
