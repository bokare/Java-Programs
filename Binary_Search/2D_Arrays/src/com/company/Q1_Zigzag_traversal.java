package com.company;

import java.util.ArrayList;

public class Q1_Zigzag_traversal {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 },
        };
        Zigzag(arr);

    }
    static void Zigzag(int [][] arr){
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=1 ; i<arr.length+arr[0].length;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0 ;i<arr[0].length;i++){
            for(int j=0 ;j<arr.length;j++){
                list.get(i+j).add(arr[j][i]);
            }
        }
        for(ArrayList a : list){
            System.out.println(a);
        }
    }
}
