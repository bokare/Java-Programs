package com.company;
import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        calci();
    }

    static void calci() {

        System.out.println("Welcome to CSC 210 Calculator by Bob the Builder!");
        System.out.println("Enter an integer operation: ");

        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        String operation= input.next();
        int y = input.nextInt();

        while(x != 0 && y != 0) {

            if ("+".equals(operation)) {
                System.out.println(x + y);
            } else if ("-".equals(operation)) {
                System.out.println(x - y);
            } else if ("*".equals(operation)) {
                System.out.println(x * y);
            } else if ("/".equals(operation)) {
                System.out.println(x / y);
            } else if ("%".equals(operation)) {
                System.out.println(x % y);
            } else {
                System.out.println("Operation is invalid.");
            }
            break ;
//            System.out.println("Enter an integer operation: ");
//            x = input.nextInt();
//            operation= input.next();
//            y = input.nextInt();
        }
        System.out.println("repeat or end");
        String tre= input.next();
        if(tre.equals("yes")) {
            calci();
        }

    }
}
