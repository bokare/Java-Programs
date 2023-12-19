package com.company;

import java.util.*;
import java.io.*;

class Main {

    public static boolean ArrayChallenge(int[] arr) {
        // code goes here
        for(int i=1 ;i<arr.length; i++){
            if(!superr(arr,i)){
                return false ;
            }
        }
        return true; //  arr[0];
    }
    static boolean superr(int[] arr , int n){
        int sum = 0;
        for(int i=0 ; i<n ; i++){
            sum = sum + arr[i] ;

        }
        return sum < arr[n] ;
    }


    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        int[] arr = {0,2,3,6,12} ;
        System.out.print(ArrayChallenge(arr));
    }

}
