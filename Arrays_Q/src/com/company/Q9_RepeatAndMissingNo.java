package com.company;

import java.util.Arrays;
public class Q9_RepeatAndMissingNo {
    public static void main(String[] args) {
        int[] arr = {3,1,3};
        findNo2(arr);
    }

    static void findNo(int[] arr){
        Arrays.sort(arr);
        int i=1;
//        int[] num = new int[2];
        while(i<= arr.length){

            int correct = i;
            if(arr[correct-1]!=i){
                System.out.println("missing = "+i);
                System.out.println("repeat = "+arr[i-1]);
                break;
            }else{
                i++;
            }
        }

    }
    static void findNo2(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
//        int[] num = new int[2];
        while (i < arr.length) {

            int correct = arr[i]-1;
            if (arr[correct ] != i+1) {
                System.out.println("missing = " + i+1);
                System.out.println("repeat = " + arr[i]);
                break;
            } else {
                i++;
            }
        }
    }
}
