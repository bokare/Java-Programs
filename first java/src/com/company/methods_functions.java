package com.company;
import java.util.Scanner;

public class methods_functions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter your name");
//        String name = sc.next();
//        Printname(name);
        System.out.println("enter a = ");
        int a = sc.nextInt();
        System.out.println("enter b = ");
        int b = sc.nextInt();
        System.out.println("enter a operator");
        String op = sc.next();
        sum(a, b, op);

    }

    static void Printname(String name) {

        System.out.println("hello " + name);
        System.out.println("have a nice day " + name + " !!");
    }

     static void sum(int a, int b, String op) {
        int ans = 0;
        if (op.equals("+")) {
            ans = a + b;
            System.out.print(a + "+" + b + "=");
            System.out.println(ans);
        } else if (op.equals("-")) {
            ans = a - b;
            System.out.print(a + "-" + b + "=");
            System.out.println(ans);
        } else if (op.equals("*")) {
            ans = a * b;
            System.out.print(a + "*" + b + "=");
            System.out.println(ans);
        } else if (op.equals("/")) {
            ans = a / b;
            System.out.print(a + "/" + b + "=");
            System.out.println(ans);
        }else{
            System.out.println("invalid input");
        }

    }

}

