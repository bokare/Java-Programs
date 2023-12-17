package com.company;
import java.util.Arrays;

public class Q11_Rainwater {
    public static void main(String[] args) {
        //int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1} ;
        int[] arr = {3,0,2,0,4};
        //int[] arr = {2,1,3} ;
        water(arr);
    }
    static void water(int[] arr){
        int water = 0 ;
        for(int i= 1; i<arr.length; i++){

          int maxleft = max(arr,0,i) ;
          int maxright = max(arr,i+1,arr.length);
          if(maxleft>arr[i] && maxright>arr[i]){
              int height = Math.min(maxleft,maxright);
              water = water+height-arr[i] ;
          }
        }
        System.out.println(water);

    }
    static int max (int[] arr,int first, int last){
        int max = Integer.MIN_VALUE ;
        for(int i=first;i<last;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max ;
    }


}

