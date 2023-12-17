package com.company;

import java.util.Scanner;
public class Time_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println(" Enter The Total Seconds ");
        long second = sc.nextLong() ;
        int hours = (int)second/(60*60) ;
        int minute = (int)(second%(60*60))/60 ;
        int seconds = (int)(second%(60*60))%60 ;
        System.out.println("hours = "+hours + ", minutes = "+minute + ", second = "+seconds);
    }
}
