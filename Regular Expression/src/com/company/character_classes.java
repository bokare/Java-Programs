package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class character_classes {
    public static void main(String[] args) {
        String x  = "[^abc]" ;      // other than a,b,c
        //x = "[a-zA-Z]" ;
        Pattern p = Pattern.compile(x)  ;
        Matcher m = p.matcher("ab7@z#S8") ;
        while(m.find()){
            System.out.println(m.start()+"..."+m.group());
        }






//        System.out.println(m.find());
//        System.out.println(m.start()+"..."+m.group());
//        System.out.println(m.start()+"..."+m.group());
//        System.out.println(m.start()+"..."+m.group());
//        System.out.println(m.find());
//        System.out.println(m.start()+"..."+m.group());
//        System.out.println(m.find());



    }
}
