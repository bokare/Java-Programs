package com.company;

import java.util.ArrayList;
import java.util.Arrays;

//CORRECT PROGRAM IS NEXT ,THIS PROGRAM IS APPLICABLE ONLY IF NOT MORE THAN TWO CONSECUTIVE INTERVAL OVERLAPS;
public class Q20_mergeInterval {
    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2,4}, {3,7}, {6,8}};
        Bubble(arr);
        Merge(arr);
    }

    static void Merge(int[][] arr){
        ArrayList<int[]> list = new ArrayList <>() ;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i][1]>arr[i+1][0]){
                int [] newArr= new int[2];
                newArr[0]=arr[i][0];
                newArr[1]=arr[i+1][1];
                list.add(newArr);

            }
        }
        for(int[] a:list){
            System.out.println(Arrays.toString(a));
        }

    }

    static void Bubble(int[][] arr) {
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