package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex1 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("ab") ;
        Matcher m = p.matcher("ababbbabb") ;

//        System.out.println(m.find());  // true      every time point to next match
//        System.out.println(m.find());   // true
//        System.out.println(m.find());   // true
//        System.out.println(m.find());   // false

        int count = 0 ;
        while(m.find()){
            count++;
            System.out.println(m.start()+" "+m.end()+" "+m.group());
        }
        System.out.println("count are "+ count);
    }
}
