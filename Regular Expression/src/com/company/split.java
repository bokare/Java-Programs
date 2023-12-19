package com.company;

import java.util.Arrays;
import java.util.regex.Pattern;

//  Pattern class Split method

public class split {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s") ;
        String str = " my name is vaibhav" ;
        String[] arr = p.split(str) ;
        for(String s :arr){
            System.out.println(s);
        }
        System.out.println(arr.length);  // 5

        Pattern pr = Pattern.compile("\\.") ;
        pr = Pattern.compile("[.]") ;
        str = "www.google.com" ;
        arr = pr.split(str) ;
        System.out.println(Arrays.toString(arr));
    }
}
