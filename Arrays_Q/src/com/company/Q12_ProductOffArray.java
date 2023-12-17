package com.company;
import java.util.Arrays;

public class Q12_ProductOffArray {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4};
        int[] arr = {-1,1,0,-3,3} ;
        //int[] arr = {5} ;   // check for condition of if array consist of one element only

        System.out.println(Arrays.toString(product(arr)));

    }
    static int[] product(int[] arr){
        int[] nums = new int[arr.length];
        if(arr.length==1){
            return nums ;
        }
        for(int i= 0;i<nums.length ;i++){
            int product =pro(arr,i);
            nums[i]=product ;
        }
        return nums;
    }

    static int pro(int[] arr,int index){
        int product = 1;        // check for condition of if array consist of one element only
        for(int i= 0;i<arr.length;i++){
            if(i==index){
                continue;
            }else{
                product=product*arr[i];
            }
        }
        return product ;
    }
}
