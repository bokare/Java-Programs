package com.company;

import java.util.Scanner;

public class Check_PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if (0 < input) {
            boolean ans = prime(input);
            System.out.println(ans);

        } else {
            System.out.println("invalid input");
        }
    }

    static boolean prime(int input) {
        if (input == 1) {
            return false;
        }
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}


