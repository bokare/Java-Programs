package com.company;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        Integer n = 49 ;
        String d = "56" ;
vaibhav();
        String[] s = new String[4] ;
        System.out.println(Arrays.toString(s));

        char[] a = {'s','a'} ;
        char[] ss = new char[5] ;
        System.out.println(ss[1]);
        vaibhav(Arrays.toString(a));

        System.out.println(Math.random()*100);
      // System.out.println(c);

        System.out.printf("%03d",2);  //002
        String num = String.format("%03d",5);
        System.out.println();
        System.out.println(num);  //005
    }
    public static void vaibhav(Object o){
        System.out.println(o.toString());

    }
    public static void vaibhav(){
        System.out.println();

    }

}
