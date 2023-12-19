package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //LINEAR SEARCH
        //Q - check whether a target element present or not in given array ;
        int[] num = {12,54,2,4,56,87,15,42,65,38,92,78,5,58,88};
        int target = 15 ;
        //int ans = linear_search(num,target);
        System.out.println(linear_search(num,target));
        //System.out.println(ans);
    }
    static int linear_search(int[]arr,int target){
        if(arr.length == 0){
            return -1 ;
        }
        for(int i=0 ; i<arr.length ; i++){
            int element = arr[i];
            if(element==target){
                return i ;
            }
        }
        return -1 ;

    }
}
