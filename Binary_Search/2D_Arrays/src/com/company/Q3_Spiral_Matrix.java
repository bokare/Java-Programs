package com.company;
import java.util.ArrayList;

public class Q3_Spiral_Matrix {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println(answer(arr,0,arr.length-1));
    }

    static ArrayList<Integer>list = new ArrayList<>();
    static ArrayList<Integer> answer(int[][] arr, int f, int l){
        int row=f, col =f ;
        for(;;){
            list.add(arr[row][col]);
            if(list.size()==16){
                //System.out.println(arr[row][col]);
                //System.out.println(list);
                return list ;
               // break;
            }
            if(row==f && col<l){
                col++;
            }else if(col==l && row<l){
                row++;
            }else if (row==l && col>f ){
                col--;
            }else{
                row--;
            }
            if(row==f && col==f){
                 return answer(arr,f+1,l-1) ;
            }
        }

    }

}