package com.company;
// FINDING AN MAX ELEMENT IN  ROTATED ARRAY BY USING RECURSION ;

public class Q14_MaxInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,8,47,2} ;
        System.out.println(rotated(arr,Integer.MIN_VALUE,0,arr.length-1));

    }
    static int rotated(int[] arr, int max ,int start ,int end){

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= max) {
                max = arr[mid];
            }
            if (arr[start] < arr[mid]) {
                if (max > arr[start] && max < arr[mid]) {
                    return rotated(arr,max, start, mid - 1);
                } else {
                    return rotated(arr, max,mid + 1, end);
                }
            }

            if ( max < arr[end] && max > arr[mid]) {
                return rotated(arr,max, mid + 1, end);
            } else
                return rotated(arr,max, start, mid - 1);
        }
        return max ;
    }

}
