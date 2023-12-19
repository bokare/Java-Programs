package com.company;

import java.util.Scanner ;
public class Main {

    public static void main(String[] args) {
        // print a no from 1to n;
       Scanner sc = new Scanner(System.in) ;
       System.out.println("enter a last number : ");
       int n = sc.nextInt();
       int num ;
       for (num=1 ;num <= n ; num++){
           System.out.println(num);
       }
    }
}