package com.company;
import java.util.ArrayList;

public class Q16_3sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        //int[] arr = {0,0,0};

        System.out.println(sum(arr));
    }
    static ArrayList<Integer> sum(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(j==i){
                    continue;
                }
                else{
                    for(int k=j+1;k< arr.length;k++){
                        if(k==i||k==j){
                            continue;
                        }
                        else if(arr[i]+arr[j]+arr[k]==0){
                            list.add(arr[i]);
                            list.add(arr[j]);
                            list.add(arr[k]);
                            //CREATE COMPARE FUNCTION WHICH COMPARES THE CURRENT ARRAY ELEMENT
                            // WITH EXISTING ARRAY ELEMENT IF MATCH FOUND DO NOT ADD ELEMENT TO ARRAYLIST IF AT LEAST ONE ELEMENT
                            // IS DISTINCT OF CURRENT ELEMENT THEN ADD TO LIST ;

                        }
                    }
                }
            }
        }
        return list;
    }
}
