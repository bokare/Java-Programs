package com.company;

public class SumOfDigits {
    public static void main(String[] args) {
        int digit  = 123 ;
        System.out.println(sum(digit));
    }
    static int sum(int n){
        int rem  = n%10 ;
        if(n==0){
            return 0 ;
        }
        n = n/10 ;
        return rem+sum(n) ;
    }
}
