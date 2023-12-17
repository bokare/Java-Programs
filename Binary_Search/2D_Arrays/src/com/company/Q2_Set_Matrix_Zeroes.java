package com.company;

import java.util.Arrays;

public class Q2_Set_Matrix_Zeroes {
    public static void main(String[] args) {
        int [][] matrix = {
                {0,1,1},
                {1,1,1},
                {1,1,1}
        };
        int [][] arr= new int [3][3]  ;
        for(int i=0; i< matrix.length;i++){
            for(int j=0 ; j<matrix[i].length;j++){
                arr[i][j]=matrix[i][j];
            }
        }

        output(arr,matrix);
    }
    static void output(int [][] newarr,int[][] arr){
        for(int i=0; i< arr.length;i++){
            for(int j=0 ; j<arr[i].length;j++){
                if(arr[i][j]==0) {
                    makezero(newarr, i, j);
                }
            }
        }
        for(int[] a: newarr){
            System.out.println(Arrays.toString(a));
        }

    }
    static void makezero(int[][]newarr,int row, int col){
        for(int i=0; i< newarr.length;i++){
            for(int j=0 ; j<newarr[i].length;j++){
                if(i==row||j==col){
                    newarr[i][j]=0;
                }
            }
        }
    }
}
