package com.company;

import java.util.Scanner;

public class scanner_input_in_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte b = sc.nextByte();  // taking input
        System.out.println("this is stored in sc.next = " + sc.next()); // here again take input
        scanner_input();
    }

    static void scanner_input() {
        Scanner sc = new Scanner(System.in);
        try {
            byte b = sc.nextByte();   // here taking input
            System.out.println( " in try");
        }
        catch (Exception e){
            System.out.println("in catch");
            System.out.println(sc.next()); // *** IMP ****   here will not again take input only  print input taken in try block ie b
        }
    }
}
