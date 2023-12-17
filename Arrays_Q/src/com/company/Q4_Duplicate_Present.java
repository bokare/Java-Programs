package com.company;

import java.util.*;

public class Q4_Duplicate_Present {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,4,6,8,9};
        System.out.println(duplicate(arr));
        System.out.println(duplicate_using_set(arr));
    }

    static boolean duplicate(int[] arr){    //TRY THIS USING BINARY NUMBERS
        for(int i=0; i< arr.length; i++){
            for(int j=i+1 ;j< arr.length ;j++){
                if(arr[i]==arr[j]){
                    return true ;
                }
            }
        }
        return false;
    }

    // another method
    static boolean duplicate_using_set(int[] arr){
        HashSet<Integer> myset = new HashSet<>() ;
        for (int a:arr) {
            myset.add(a) ;
        }
        return arr.length!=myset.size() ;
    }

}
