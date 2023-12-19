package com.company;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-4,-5} ;
        System.out.println(max(arr,0,arr[0]));
        System.out.println(min(arr,0,arr[0]));
    }

    static int max(int[] arr,int i,int max){
        if(i== arr.length){
            return max ;
        }
        if(arr[i]>max){
            max = arr[i] ;
        }
        return max(arr,i+1,max) ;
    }

    static int min(int[] arr,int i,int min){
        if(i== arr.length){
            return min ;
        }
        if(arr[i]<min){
            min = arr[i] ;
        }
        return min(arr,i+1,min) ;
    }

}
