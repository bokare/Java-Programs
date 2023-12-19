package com.company;

import java.util.Scanner;

public class fibinacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;

        char i = 'a'; ;
        while( i != '\n'){      // ******
            i = sc.next().charAt(0) ;
            System.out.println(i);
        }
    }
}

























