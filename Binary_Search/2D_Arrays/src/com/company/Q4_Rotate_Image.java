package com.company;
import java.util.* ;

public class Q4_Rotate_Image {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        image(matrix) ;

    }
    static void image(int[][] arr){
        Queue<Integer> queue = new LinkedList<>();
        for(int col=0 ; col<arr[0].length;col++){
            for(int row= arr.length-1 ;row>=0 ;row--){
                queue.add(arr[row][col]) ;
            }
        }
        //int[][] newmatrix = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = queue.remove();
            }
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
