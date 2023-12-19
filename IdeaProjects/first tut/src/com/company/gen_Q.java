package com.company;
import java.util.Arrays ;
public class gen_Q {
    public static void main(String[] args) {
        int[] arr = new int [10] ;
        ab(arr) ;
        System.out.println(Arrays.toString(arr));
    }
    public static void ab(int[] arr){
        int starteven = 2 ;
        for(int i =0 ; i< arr.length/2 ; i++){
            arr[i*2] = starteven ;
            starteven = starteven+2 ;
        }
        int startprime = 17 ;
        int count = 1 ;
        while(count < arr.length){
            if(prime(startprime)){
                arr[count] = startprime ;
                count = count +2;
                startprime++ ;
            }else{
                startprime++;
            }
        }

    }
    public static Boolean prime(int n){
        for(int i = 2 ; i<n ; i++){
            if(n%i==0){
                return false ;
            }
        }
        return true ;
    }
}