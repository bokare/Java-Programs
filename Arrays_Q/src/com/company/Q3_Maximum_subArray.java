package com.company;
// k
public class Q3_Maximum_subArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(subArray(arr));

    }
    static int subArray(int[] arr){
        int max= Integer.MIN_VALUE;
        int currentSum=0;
        for(int i= 0;i< arr.length;i++){
            currentSum=currentSum+arr[i];
            if(currentSum>max){
                max=currentSum;
            }
            if(currentSum <0){
                currentSum =0 ;
            }

        }
        return max ;
    }
}
