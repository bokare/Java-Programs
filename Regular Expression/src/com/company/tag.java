package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class tag {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^(<[\\w]+>)+[\\w\\s]*(</[\\w]+>)+$") ;
        Matcher m = p.matcher("<img><hr> vaibhav </hr></img>" ) ;
        System.out.println(m.matches());
        System.out.println(m.start()+"   "+m.group());

    }
}
