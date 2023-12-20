package com.company;

import java.util.Arrays;
// *** nice question
public class Q12_Next_Permutation {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 6, 5, 4} ;
        //int[] arr = {5,4,3,2,1} ;
        int[] ans = permutation(arr) ;
       System.out.println(Arrays.toString(ans));

    }
    static int[] permutation(int[] arr){
        if(arr==null || arr.length<=1){
            return arr;
        }
        // to find the  breakpoint ie from where the no need to be change
        int i= arr.length-2;
        for(i= arr.length-2; i>=0 ;i--){
            if(arr[i]<=arr[i+1]){
                break;  // here we get breakpoint ie i
            }
        }
        if(i==-1){  // means array is sorted in descending order
            reverse(arr,i+1,arr.length-1);
            return arr ;
        }
        // to find which no is greater than breakpoint no from last
        int j= arr.length-1;
        for(j= arr.length-1;j>=0;j--){
            if(arr[j]>=arr[i]){
                break;
            }
        }
        // now we have i and j now swap
        swap(arr,i,j) ;

        // now just reverse from i+1 to last
        reverse(arr,i+1 ,arr.length-1);
        return arr ;
    }

    static void swap(int[]arr,int i, int j){
        int temp=arr[i] ;
        arr[i]=arr[j];
        arr[j]=temp ;
    }

    static void reverse(int[] arr, int i, int j) {
        while(i<j){
            swap(arr,i++,j--);
        }
    }
}
