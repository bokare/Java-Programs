package com.company;

import java.util.Scanner;

public class fibbonacci_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt() ;
        int a = 0 ;
        int b = 1 ;
        int count = 2;
        for(count=2; count<=num; count++){
            int temp = b ;
            b = b+a ;
            a = temp;

           // System.out.println(b);
        }
        System.out.println(b);

    }
}