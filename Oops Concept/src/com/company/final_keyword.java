package com.company;

public class final_keyword {
    public static void main(String[] args) {
        // 1  if primitive are final then can not change
        final int a = 10 ;
        //  a =20 ;  Cannot assign a value to final variable 'a'


        // 2
        // if object are not final then can initialize again like below
         int[] arr = {1,2,3,4,5} ;
         arr = new int[]{2, 5};


        // 3
        // if object are  final then can not initialize again like below but can modify
         final int[] ar = {1,2,3,4,5} ;
        //  ar = new int[]{2, 5};   give  error

    }
}
