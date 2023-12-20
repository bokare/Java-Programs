package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class primeBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n= sc.nextInt() ;
        BigInteger num = new BigInteger(String.valueOf(n)) ;
        // BigInteger num = new BigInteger(n+"") ;

        System.out.println(num.isProbablePrime(1)?"prime":"not prime");

    }
}
