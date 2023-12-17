package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String [][] arr = new String[6][6] ;
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextLine().trim().split(" ") ;
        }
        int max = Integer.MIN_VALUE ;
        for(int row=0 ;row<arr.length-2;row++){
            for(int col=0 ;col<arr[row].length-2;col++){
                int sum = answer(arr,row,col);
                if(sum>max){
                    max = sum ;
                }
            }
        }
        System.out.println(max);
    }

    static int answer(String[][] arr,int startrow,int startcol){
        int sum = 0 ;
        for(int i=startrow; i<=startrow+2;i++) {
            for (int j = startcol; j <= startcol + 2; j++) {
                if((i==startrow+1) && (j==startcol || j==startcol+2)){
                    continue;
                }
                sum += Integer.parseInt(arr[i][j]);
            }
        }
        return sum ;
    }
}
