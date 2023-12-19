package com.company;
import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1,8,6} ;
        int [] ans = mergesort(arr) ;
        System.out.println(Arrays.toString(ans)); //it will not change the original array arr but create new one
        System.out.println(Arrays.toString(arr)); //in this we create mix array and store to ans
    }

    static int[] mergesort(int[] arr) {
        if(arr.length==1){
            return arr ;
        }
        int mid = arr.length/2;
        int[] left = mergesort(Arrays.copyOfRange(arr,0,mid)) ;
        int[] right = mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left, right) ;
    }

    static int[] merge(int[] left, int[] right) {
        int[] mix = new int [left.length+ right.length] ;
        int i=0 ;
        int j=0 ;
        int k=0 ;
        while(i< left.length && j< right.length){
            if(left[i] < right[j]){
                mix[k] = left[i] ;
                i++;
            }else{
                mix[k] = right[j] ;
                j++ ;
            }
            k++ ;
        }
        // it may happen that one array is not complete and there is some element are remaining ;
        while(i < left.length){
            mix[k] = left[i] ;
            i++;
            k++;
        }
        while(j < right.length){
            mix[k] = right[j] ;
            j++;
            k++;
        }

        return mix ;
    }
}
//    public static void copyofrangeproperty() {
//        int[] arr = {5,7,8,9} ;
//        int[] mat = change(Arrays.copyOfRange(arr,0,2)) ;
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(mat));
//    }
//    static int[] change(int[] arr){
//        arr[0] = 100 ;
//        return arr ;
//    }
