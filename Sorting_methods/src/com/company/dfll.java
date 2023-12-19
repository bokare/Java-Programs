package com.company;

import java.util.Arrays;

public class dfll {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9} ;
        int[] mat = change(Arrays.copyOfRange(arr,0,2)) ;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mat));
    }
    static int[] change(int[] arr){
        arr[0] = 100 ;
        return arr ;
    }
}
