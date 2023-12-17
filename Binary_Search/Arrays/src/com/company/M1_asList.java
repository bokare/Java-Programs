package com.company;

import java.util.Arrays;
import java.util.List;

//      *****   For converting array into  fixed size list
public class M1_asList {
    public static void main(String[] args) {
        Integer[]  arr = {1,2,3} ;
        List<Integer> list = Arrays.asList(arr) ;
        System.out.println(Arrays.asList(arr));

//        list.add(5) ;          //  ****  give error as it is fixed length list
        list.set(0,100) ;
        System.out.println(list);

        System.out.println(Integer.compareUnsigned(12, -15));

    }
}
