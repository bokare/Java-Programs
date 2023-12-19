package com.company;

public class superSeries {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 17} ;
        System.out.println(output(arr));

    }
    public static boolean output(int[] arr){
        for(int i=0; i< arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false ;
            }
        }
        return true ;
    }

}
