package com.company;

import java.util.Scanner;

public class Alphabet_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("the character is in LOWERCASE");
        }else{
            System.out.println("the character is in UPPERCASE");
        }
    }
}