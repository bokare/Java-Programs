package com.company;

import java.util.Scanner;

public class String_ntimes {
    public static void main(String[] args) {
        //print a string ("hello world") n times
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  number , how much times do you want to repeat a string: ");
        int n = sc.nextInt();
        for (int num = 1; num <= n ; num++) {
            System.out.println("hello world");
        }
    }
}
