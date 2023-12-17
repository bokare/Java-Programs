package com.company;
import java.util.ArrayList;

public class Q16_3Sum2{
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        //int[] arr = {0,0,0};
        System.out.println(sum(arr));
    }

    static ArrayList<ArrayList<Integer>> sum(int[] arr){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k< arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        ArrayList<Integer> templist = new ArrayList<>();
                        templist.add(arr[i]);
                        templist.add(arr[j]);
                        templist.add(arr[k]);
                        list.add(templist);
                    }
                }
            }
        }
        return list;
    }
}