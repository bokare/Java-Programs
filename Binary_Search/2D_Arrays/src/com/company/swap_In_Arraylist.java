package com.company;

//  ***** I M P *****
import java.util.ArrayList;
import java.util.Collections;

public class swap_In_Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>() ;
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        swapp(list,0,4);
        Collections.swap(list,1,3) ;    // *** IMP ***  direct fun to swap
        System.out.println(list);
    }
    static void swapp(ArrayList<Integer> list , int i, int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
}
