package com.company;

public class Q13_MaxProSubArray {
    public static void main(String[] args) {
        int[] arr ={2,3,-2,4} ;
        System.out.println(maxProduct(arr));
    }

    static int maxProduct(int[] arr){
        int max= Integer.MIN_VALUE;
        int currentpro=1;
        for(int i= 0;i< arr.length;i++){
            currentpro=currentpro*arr[i];
            if(currentpro>=max){
                max=currentpro;
            }
            else if(currentpro <=0){
                currentpro =1 ;
            }

        }
        return max ;
    }
}
