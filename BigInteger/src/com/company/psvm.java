package com.company;
import java.util.Scanner;

public class psvm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        for(int i=0 ;i<n;i++){
            arr[i] = sc.nextInt() ;
        }
        System.out.println(ans(arr,n));
    }
    static int ans(int[] arr , int n){
        int c = 0 ;
        for(int i=0;i<n;i++){
            if(supe(arr,i)){
                c++ ;
            }
        }
        return c;
    }
    static boolean supe(int[] arr,int start){
        for(int i=start+1 ;i<arr.length;i++){
            if(arr[i]>=arr[start]){
                return false ;
            }
        }
        return true ;
    }
}
