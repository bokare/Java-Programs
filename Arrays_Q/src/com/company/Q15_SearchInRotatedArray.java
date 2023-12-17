package com.company;

public class Q15_SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,2,3,4,5} ;
        System.out.println(rotated(arr,5,0,arr.length-1));


    }
    static int rotated(int[] arr ,int target,int start ,int end){
        if(start>end){
            return -1 ;
        }
        int mid = start +(end-start)/2 ;
        if(arr[mid] == target){
            return mid ;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return  rotated(arr , target, start , mid-1) ;
            }
            else{
                return  rotated(arr , target, mid+1 , end) ;
            }
        }

        if(target<=arr[end] && target>=arr[mid]){
            return  rotated(arr , target, mid+1 , end) ;
        }
        else
            return  rotated(arr , target, start , mid-1) ;
    }
}
