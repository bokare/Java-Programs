package com.company;

public class main_with_recursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        System.out.println(n);  //1,2,3,4,5
        if (n == 5) {
            return;
        }
        print(n + 1);
        System.out.println(n); //4,3,2,1
    }
}