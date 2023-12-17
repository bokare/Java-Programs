package com.company;
import java.util.Arrays;

// Space optimization using bit manipulations

public class Q23_a_To_b {
    public static void main(String[] args) {
        int a= 2;
        int b= 10;
        int[] arr = new int[b-a+1];
        for(int i= a;i<a+b-1;i++){
            if(i%2==0 || i%5==0){
                arr[i-a]=1;
            }
            else{
                arr[i-a]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                System.out.print(i+a+" ");
            }
        }
    }
}
