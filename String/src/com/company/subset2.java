package com.company;

import java.util.ArrayList;

public class subset2 {
    public static void main(String[] args) {
        String s = "vaibhav" ;
        subset(s,3) ;
        System.out.println(list);
    }
    static ArrayList<String> list = new ArrayList<>() ;
    static void subset( String up,int k){
        if(up.length()<k){
            return ;
        }
        String p = up.substring(0,k) ;
        list.add(p) ;
        subset(up.substring(1),k);
    }
}
