package com.company;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner (System.in) ;
        int n= sc.nextInt() ;
        String[][] arr = new String[n][] ;
        for(int i=0 ;i<n;i++){
            int d = sc.nextInt() ;
            // for(int j=0 ;j<d;j++){
            //     arr[i][j]=sc.nextInt() ;
            // }
            if(d>0){
                arr[i]= sc.nextLine().trim().split(" ") ;
            }

        }
//        for(String[] a:arr){
//            System.out.println(Arrays.toString(a));
//        }
        int q = sc.nextInt() ;
        for(int i=0;i<q;i++){
            int row = sc.nextInt()-1;
            int col = sc.nextInt()-1;
            if(i==0){
                System.out.println();
            }
            try{
                System.out.println(arr[row][col]);
            }
            catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}