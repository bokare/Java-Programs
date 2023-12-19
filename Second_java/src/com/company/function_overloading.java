package com.company;

import java.util.Arrays;

public class function_overloading {
    public static void main(String[] args) {
        //when there are two fun with same name
        int[] n = {1,2,3,45,6};
        fun(n); //it compare the argument type of function ;
        String[] m = {"vaibhab","bokare"};
        fun(m);
    }
    static void fun(int[] a){
        System.out.println("this is integer fun");
        System.out.println(Arrays.toString(a));
    }
    static void fun(String[] s){
        System.out.println("this is string fun");
        System.out.println(Arrays.toString(s));
    }
}
