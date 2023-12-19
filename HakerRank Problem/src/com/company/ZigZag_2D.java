package com.company;

public class ZigZag_2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11},{12,13}};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for (int j=0;j<arr[i].length;j++){
                    System.out.println(arr[i][j]);
                }
            }
            if(i%2!=0){
                for (int j=arr[i].length-1 ; j>=0;j--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
