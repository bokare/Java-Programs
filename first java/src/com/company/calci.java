package com.company;
import java.util.Scanner;
public class calci {
    public static void main(String[] args) {

        int ans = 0 ;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the operation");
            String op = sc.next().trim();
            if (op.equals("x") || op.equals("X")){
                break;
            }
            System.out.println("enter the numbers");
            int x = sc.nextInt();
            int y = sc.nextInt();

            if ("+".equals(op)) {
                System.out.println(x + y);
            } else if ("-".equals(op)) {
                System.out.println(x - y);
            } else if ("*".equals(op)) {
                System.out.println(x * y);
            } else if ("/".equals(op)) {
                System.out.println(x / y);
            } else if ("%".equals(op)) {
                System.out.println(x % y);
            }
            else {
                System.out.println("Operation is invalid.");
            }
        }
    }
}
