package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class quantifiers {
    public static void main(String[] args) {
        String x = "a" ;
//        x = "a+" ;
        x = "a?" ;
//        x = "a*" ;  // **** also consider index at length position
        Pattern p = Pattern.compile(x)  ;
        Matcher m = p.matcher("abaaba") ;
        while(m.find()){
            System.out.println(m.start()+"..."+m.group());
        }
    }
}
