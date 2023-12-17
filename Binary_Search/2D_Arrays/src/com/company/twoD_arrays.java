package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class twoD_arrays {
    public static void main(String[] args) {
        //example
//        int[][] arr = {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12}
//        };
//        System.out.println(Arrays.toString(arr[0]));
//        System.out.println(Arrays.toString(arr[1]));
//        System.out.println(Arrays.toString(arr[2]));
        String[] input = {"ABCD" ,
                          "EFGH",
                          "IJKL",
                          "WXYZ"};
       output(input,'K') ;

    }
    static void output(String[] arr, char ch){
        int a=0;
        int b=0 ;
        boolean found = false ;   //    *** IMP how to break double loop at once ;
        for(int i=0 ; i<arr.length; i++){
            for(int j=0 ; j<arr[i].length();j++){
                if(arr[i].charAt(j)==ch){
                     a=i ;  b= j ;
                     found = true ;
                    break ;
                }
            }
            if(found){
                break ;
            }
        }
        for(int i=0 ; i<b ; i++){
            System.out.println(arr[a].charAt(i));
        }
        for(int i=0 ; i<a ; i++){
            System.out.println(arr[i].charAt(a));
        }

    }
}