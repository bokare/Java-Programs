package com.company;

public class leader {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2} ;
        for(int i=0; i<arr.length;i++) {
            if(leader(arr,i)){
                System.out.println(arr[i]);
            }
        }
    }
    static boolean leader(int[] arr , int start){
        for(int i=start+1; i<arr.length;i++){
            if(arr[start]<arr[i]){
                return false ;
            }
        }
        return true ;
    }
}
