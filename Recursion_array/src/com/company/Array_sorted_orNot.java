package com.company;

public class Array_sorted_orNot {
    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 1, 2, 3, 4, 4, 8};
        System.out.println(sortedd(arr, 0));  //best method applicable for any array
    }

    static boolean sortedd(int[] arr ,int i){
        if(i==arr.length-1){   // till here previous array is sorted
            return true ;
        }
        return arr[i]<=arr[i+1] && sortedd(arr,i+1) ;
    }
}
