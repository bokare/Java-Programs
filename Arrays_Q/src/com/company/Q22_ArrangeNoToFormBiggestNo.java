package com.company;

import java.util.Arrays;

public class Q22_ArrangeNoToFormBiggestNo {
    public static void main(String[] args) {
        int[] arr = {54,546,548,60};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
        MaxNumber(arr);

    }
    static void MaxNumber(int[]arr){
        String maxnumber = "" ;
        for(int i=arr.length-1;i>=0;i--){
            maxnumber = maxnumber + arr[i];
            System.out.print(arr[i]);

        }
        System.out.println(" \nThe Possible Maximum Number is -> " + maxnumber);
    }


    static void Bubble(int[] arr) {
        for(int i = 0 ; i<arr.length  ;i++){
            for(int j = 1 ; j<arr.length -i ; j++){

                if(max(arr,j,j-1)){
                    //swapp
                    int temp = arr[j] ;
                    arr[j] = arr[j-1] ;
                    arr[j-1] = temp ;
                }
            }
        }
    }

    static boolean max (int[]arr,int x,int y){
        int max;
        int lengthof_i = length(arr[x]);
        int lengthof_j = length(arr[y]);
        int xy = arr[x]*(int)(Math.pow(10,lengthof_j))+arr[y];
        int yx = arr[y]*(int)(Math.pow(10,lengthof_i))+arr[x];
        return xy < yx ;


    }

    static int length(int num){
        int length = 0 ;
        while(num>0){
           num= num/10;
           length++;
        }
        return length;
    }

}
