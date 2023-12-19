package com.company;

import java.util.Arrays;

public class change_value {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6} ;
        System.out.println(Arrays.toString(arr));
        change(arr) ;
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] nums){
        nums[0] = 99 ;
        nums[5] = 100 ;

    }
}
