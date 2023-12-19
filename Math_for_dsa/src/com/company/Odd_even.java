package com.company;

public class Odd_even {
    public static void main(String[] args) {
        // any no and with 1 give = 1 then it is odd
        int n = -21 ;
        System.out.println(Odd(n));
        OddEven(n);

    }
    static boolean Odd(int n){
        return (n &1)==1 ;
    }

    static void OddEven(int n){
        if((n&1)==1){
            System.out.println("ODD NUMBER");
        }else{
            System.out.println("EVEN NUMBER");
        }
    }

}