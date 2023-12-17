package com.company;
import java.util.Scanner;

public class order_agnostic_array {
    public static void main(String[] args) {
        //Q- we don't know the array is sorted assending or desending orderly ;
        int[] num = {99,85,45,35,30,25,20,15,11,8,5,2,1};
        Scanner sc = new Scanner (System.in) ;
        System.out.println("enter anum which you want to search");
        int target= sc.nextInt() ;
        int ans = binary_search(num,target) ;
        System.out.println(ans);

    }
    static int binary_search(int[]arr ,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAse = arr[start] < arr[end] ;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(arr[mid] == target){
                return mid ;
            }
            if(isAse) {
                if (arr[mid] > target) {
                    end = mid - 1;

                } else if (arr[mid] < target) {
                    start = mid + 1;

                }
            }
            else{
                if (arr[mid] < target) {
                    end = mid - 1;

                } else if (arr[mid] > target) {
                    start = mid + 1;

                }
            }

        }
        return -1 ;
    }

}
