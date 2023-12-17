package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// when an array is sorted assending orderly ;
        int[] num = {1,5,15,18,20,25,29,35,38,40,65,70,88,99};
        Scanner sc = new Scanner (System.in) ;
        System.out.println("enter a num which you want to search");
        int target= sc.nextInt() ;
        int ans = binary_search(num,target) ;
        System.out.println(ans);
    }

    static int binary_search(int[]arr ,int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2 ;
            if(arr[mid] > target){
                end = mid - 1 ;
            }
            else if (arr[mid] < target){
                start = mid + 1 ;
            }
            else {
                return mid;
            }
        }
        return -1 ;
    }
}
