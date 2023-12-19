package com.company;

//import java.util.*;
//import java.lang.Math;

public class Pattern {
    public static void main(String[] args) {


        ans(4,4) ;

    }
    public static void ans(int i,int s){
        if(s==0){
            return ;
        }
        ans(i,s-1);
        System.out.println(" ".repeat(i-s)+"#".repeat(s));
    }


}
