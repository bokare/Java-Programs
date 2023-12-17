package com.company;

public class Q18_GivenSumPair {
    public static void main(String[] args) {
       // int[] arr = {11,15,6,8,9,10};
        int[] arr = {11, 15, 26, 38, 5, 10} ;
        int given = 16 ;
        System.out.println(Pair(arr,given));
    }
    static boolean Pair(int[] arr,int given){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==given){
                    System.out.println(i+" "+j);
                    return true;
                }
            }
        }
        return false ;
    }
}
