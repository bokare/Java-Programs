package com.company;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt();
        for(int c=2 ; c<=n ;c++ ){
            if(n==c){
                System.out.println("prime");
                break;
            }
            if(n%c ==0){
                System.out.println("not prime");
                break;
            }
        }
    }
}
