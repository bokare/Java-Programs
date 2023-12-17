package com.company;

import java.util.ArrayList;
import java.util.Arrays;
// ** CORRECT PROGRAM !! **

public class Q20_mergeInterval2 {
    public static void main(String[] args) {
            int[][] arr = {{8,9}, {2,4},{1,3}, {3,7} };
            Bubble(arr);
            Merge(arr);
    }

    static void Merge(int[][] arr){
        ArrayList<Integer[]> list = new ArrayList <>() ;

            for(int i=0;i<arr.length;){
                for(int j= i;j< arr.length;){
                    if(j== arr.length-1){
                        Integer[] newArr = new Integer[2];
                        newArr[0] = arr[i][0];
                        newArr[1] = arr[j][1];
                        list.add(newArr);
                        i=j+1;
                        break;
                    }
                    if(arr[j][1]>arr[j+1][0]){
                        j++;
                    }
                    else {
                        Integer[] newArr = new Integer[2];
                        newArr[0] = arr[i][0];
                        newArr[1] = arr[j][1];
                        list.add(newArr);
                        i=j+1;
                        break;
                    }
                }
            }

            for(Integer[] a:list){
                System.out.println(Arrays.toString(a));
            }

    }

    static void Bubble(int[][] arr) {  //FOR SORTING ARRAY !!
            for(int i = 0 ; i<arr.length  ;i++){
                for(int j = 1 ; j<arr.length -i ; j++){
                    if(arr[j][0] < arr[j-1][0]){
                        //swap
                        int[] temp = arr[j] ;
                        arr[j] = arr[j-1] ;
                        arr[j-1] = temp ;
                    }
                }
            }
    }
}

