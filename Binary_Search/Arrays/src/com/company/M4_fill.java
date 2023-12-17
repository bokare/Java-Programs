package com.company;
import java.util.Arrays;

//  it fills at every position given number
public class M4_fill {
    public static void main(String[] args) {
        int[] arr = new int[5] ;
        Arrays.fill(arr,10) ;
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr,2,5,0);
        System.out.println(Arrays.toString(arr));


        int[][] arr2 = new int[2][3] ;
        Arrays.fill(arr2,5);      // not for 2D  give error


    }
}
