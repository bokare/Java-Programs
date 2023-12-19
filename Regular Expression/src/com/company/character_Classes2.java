package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class character_Classes2 {
    public static void main(String[] args) {
        String x = "\\s" ;  //  0  3  8  11  // space
        x = "\s" ;  //  space
        x = "\\S" ;   //  except space
        x = "\\d" ;    //  only digit
        x = "\\D" ;     //  except digit
        x = "\\w" ;  //  [a-zA-Z0_9]
        x = "\\W" ;  //   [^a-zA-Z0_9]
        x = "." ;   // any character
        Pattern p = Pattern.compile(x)  ;
        Matcher m = p.matcher(" my name is @vaibhav ") ;
        while(m.find()){
            System.out.println(m.start()+"..."+m.group());
        }

    }
}
