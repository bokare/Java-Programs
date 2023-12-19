package com.company;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = { -4,-8,2,4,0,8,6,-7,1,78,52,46,1,40} ;
//        Bubble_sort bs = new Bubble_sort();
//        bs.Bubble(arr);
        Bubble(arr) ;
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr) {
        boolean swapped ;
        for(int i = 0 ; i<arr.length  ;i++){
            swapped = false ;
            for(int j = 1 ; j<arr.length -i ; j++){
                if(arr[j] < arr[j-1]){
                    //swapp
                    int temp = arr[j] ;
                    arr[j] = arr[j-1] ;
                    arr[j-1] = temp ;
                    swapped = true ;
                }
            }
            if(!swapped){
                break ;
            }
        }
    }
}

