package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Arr_1LineIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String[] arr = new String[5] ;
        arr = sc.nextLine().trim().split(" ") ;

        System.out.println(Arrays.toString(arr));
    }
}
