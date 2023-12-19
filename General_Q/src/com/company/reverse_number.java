package com.company;
import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        int ans = 0;
        while (num > 0) {
            int reminder = num % 10;
            num = num / 10;
            ans = ans * 10 + reminder;

        }
            System.out.print("revese numbe is : ");
            System.out.println(ans);
    }
}
