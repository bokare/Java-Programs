package com.company;
import java.util.*;

// *** IMP ***  related to duplicate no ;
public class Duplicate_no {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,8,8,5,5,9,9,9,9,9} ;
        System.out.println(output(arr));
    }

    static int output(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ;i< arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map);
        Set<Integer> keys = map.keySet();
        int sum = 0 ;
        for(Integer key:keys){
            if(map.get(key)<4){
                sum = sum + (4-map.get(key));
            }
        }
        return sum ;
    }
    
}
