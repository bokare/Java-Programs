package com.company;

public class Q6_SearchInRotatedArray {
    public static void main(String[] args) {        //TRY WITH BINARY SEARCH IN ROTATED ARRAY ;
        int[] arr= {5,6,7,8,9,10,1,2,3};
        int target = 3 ;
        System.out.println(Search(arr,target));

    }

    static int Search(int[] arr,int target){
        if(arr.length==0){
            return -1 ;
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1 ;
    }
}
