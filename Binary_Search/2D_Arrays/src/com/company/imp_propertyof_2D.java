package com.company;

import java.util.Arrays;

public class imp_propertyof_2D {
    public static void main(String[] args) {
        //int []
        int [][] matrix = {
                {1,1,1},
                {1,1,1},
                {1,1,1}
        };
        int [][] arr = matrix ;
        arr[1][1]=45;               // make change in arr
        for(int[] a:matrix){        // also change in matrix
            System.out.println(Arrays.toString(a));
        }
    }
}
