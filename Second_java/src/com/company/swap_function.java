package com.company;

public class swap_function {
    public static void main(String[] args) {
        int c = 10 ;
        int d = 20 ;
        //swapping
        //function overloading c = a ; d = b
        swap(c,d);
        System.out.println(c);

    }
    static void swap (int a, int b){
        int temp = a ;
        a = b ;
        b = temp ;


    }



}
