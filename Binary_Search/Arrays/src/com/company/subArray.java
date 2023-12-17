package com.company;

import java.util.Scanner;

public class subArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,3} ;
        String s = "123" ;
//        char c  = '9' ;
//        System.out.println(c);
        int n = Integer.valueOf(s.substring(0,1)) ;
        System.out.println(Integer.parseInt(s.substring(0,2)));
        System.out.println(n*8);

        //int[] arr  = {1, -2, 4, -5, 1} ;
        Scanner sc = new Scanner (System.in) ;

        String[] arr = sc.nextLine().trim().split(" ") ;
        System.out.println(answer(arr));

    }
    static int answer(String[] arr){
        int c = 0 ;
        for(int i=0 ; i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(negative(arr,i,j)){
                    c++ ;
                }
            }
        }
        return c ;
    }
    static boolean negative(String[] arr, int s, int l){
        int sum = 0;
        for(int i=s;i<=l;i++){
            sum+= Integer.parseInt(arr[i]) ;
        }
        return sum<0 ;
    }

}
