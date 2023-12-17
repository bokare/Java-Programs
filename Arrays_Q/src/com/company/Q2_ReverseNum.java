package com.company;
import java.util.Arrays;

public class Q2_ReverseNum {
    public static void main(String[] args) {
        int[] arr = {2,8,85,6,50,75,1,51,5,-5,100};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    static int[] reverse(int[] arr){
        int[] nums= new int[arr.length] ;
        for(int i=arr.length-1; i>=0 ;i--){
            nums[nums.length-1-i]=arr[i];
        }
        return nums;
    }
}
