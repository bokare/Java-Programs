package com.company;
import java.util.Arrays;

//  return -1 if two array are same else return index at which mismatch happens

public class M5_misMatch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,0} ;
        int[] arr2 = {1,2,3,5} ;


        System.out.println(Arrays.mismatch(arr,arr2));
        System.out.println(Arrays.equals(arr,arr2));

        Arrays.sort(arr,0,3);
        System.out.println(Arrays.toString(arr));
    }
}
