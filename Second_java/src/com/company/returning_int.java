package com.company;

import java.util.Scanner;

public class returning_int {
    public static void main(String[] args) {
        //int ans = returnfun();
        System.out.println(returnfun());
    }
    static int returnfun(){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enrer two number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2 ;
        System.out.print("the sum = ");
        return sum ;
      //  System.out.println("the code written after return statement can never execute");
    }
}
