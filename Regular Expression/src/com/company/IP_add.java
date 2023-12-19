package com.company;

import java.util.regex.Pattern;

public class IP_add {
    public static void main(String[] args) {

        String zeroTo255 = "(([0-9])|([0-9]{2})|([01][0-9]{2})|(2[0-4][0-9])|25[0-5])" ;
        String ip = zeroTo255+"."+zeroTo255+"."+zeroTo255+"."+zeroTo255 ;

        //System.out.println(Pattern.matches("([0-9])|([0-9]{2})|([01][0-9]{2})|(2[0-4][0-9])|25[0-5]","284"));

//        System.out.println(Pattern.matches(ip,"255.125.198.255"));


        System.out.println(Pattern.matches(ip,"2.5.1.255"));




    }



}
