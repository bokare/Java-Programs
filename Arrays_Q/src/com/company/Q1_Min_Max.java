package com.company;

public class Q1_Min_Max {
    public static void main(String[] args) {
       int[]arr = {2,1,85,6,50,75,1,51,5,-5,100};
        //int[]arr = {2,5};
        minmax(arr);
    }

    static void minmax(int[] arr) {
        if(arr.length==0){
            System.out.println("array is empty !!");
            return ;
        }
         int min = arr[0];
         int max = arr[0];
//        int min =Integer.MAX_VALUE;
//        int max= Integer.MIN_VALUE

        for(int i=0;i< arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }else if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("minimum = "+min);
        System.out.println("maximum = "+max);
    }
}
