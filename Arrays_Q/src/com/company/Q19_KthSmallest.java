package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Q19_KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 20, 15};
        int k = 2;
        System.out.println(smallest(arr, 2));
    }

    static int smallest(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }

}
