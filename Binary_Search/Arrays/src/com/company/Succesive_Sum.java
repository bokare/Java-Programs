package com.company;

import java.util.Scanner;

public class Succesive_Sum {
    public static void main(String[] args) {
        int[] arr = { 1, 5 ,7, 8 ,56 ,4 ,56 ,5} ;
        Scanner sc = new Scanner(System.in) ;

        int n  = sc.nextInt();    // sum of every n th element of array
        System.out.println(ans(arr, n));
    }

    static int ans(int[] arr, int n) {
        int sum =0 ;
        for(int i=n-1 ; i<arr.length;i+=n){
            sum+=arr[i] ;
        }
        return sum ;
    }
}
