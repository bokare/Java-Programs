package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //INTEGER ARAAYS
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));

        //STRING ARRAYS
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}