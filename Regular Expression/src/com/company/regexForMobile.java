package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexForMobile {
    public static void main(String[] args) {

//        1. for 10 digit mobile no
//         [7-9][0-9]{9}
//
//        2.   For 10 or 11 digit no. if 11 digit 1st digit must be 0
//         0?[7-9][0-9]{9}

//          3  for 10 digit or 11 digit , if 11 digit first must be 0 or 12 digit, if 12 digit first must be 91
//          (0|91)? [7-9][0-9]{9}

        Scanner sc = new Scanner(System.in) ;
        String str = sc.nextLine() ;
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}") ;
        Matcher m = p.matcher(str) ;  //

        if(m.find() && m.group().equals(str)){      //   ************************************
            System.out.println("mobile no is VALID ");
        }
        else{
            System.out.println("mobile no is INVALID ");
        }

    }
}
