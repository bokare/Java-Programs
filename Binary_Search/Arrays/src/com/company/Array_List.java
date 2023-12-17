package com.company;
import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        //when there is not a fix size of array ;
        //example
        ArrayList <Integer> list = new ArrayList(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(3,40);
        System.out.println(list);

        list.set(0,99);
        list.set(3,100);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));

    }
}
