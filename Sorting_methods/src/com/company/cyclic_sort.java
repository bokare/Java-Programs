package com.company;
import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 8,6, 7};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclic(int[] num) {
        for (int i = 0; i < num.length ;) {
            int correct = num[i] - 1;
            if (num[i] != num[correct]) {
                swap(num, i, correct );
            }
            else{
                i++ ;
            }
        }
       //System.out.println(Arrays.toString(num));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
