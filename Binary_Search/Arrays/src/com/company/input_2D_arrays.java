package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class input_2D_arrays {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        //System.out.println(Arrays.toString(arr[1]));

        //output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //another way to print output // *** best way ***
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        //other way to print output
        // enhanced for loop
       // for(datatypeofarray anyelement : arrayname){
       // System.out.println(element);

        for(int[] a : arr){ //for every element (a) in an array (arr) containing datatype (here int[] array) itself ;
            System.out.println(Arrays.toString(a));
        }
    }
    }