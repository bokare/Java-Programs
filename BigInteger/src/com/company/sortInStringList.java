package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortInStringList {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<>() ;
       list.add("1");
       list.add("2");
        list.add("10");
        list.add("4");
        list.add("5");
        //Collections.swap(list,0,4);
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> li = new ArrayList<>() ;
        li.add(5) ;
        li.add(4) ;
        li.add(3) ;
        li.add(2) ;
        li.add(1) ;
        Collections.sort(li);
        System.out.println(li);

    }
}
