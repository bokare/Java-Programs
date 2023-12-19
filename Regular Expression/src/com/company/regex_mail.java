package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex_mail {
    public static void main(String[] args) {

        //  for all mail id
       // Pattern p = Pattern.compile("[a-zA-Z][\\w._]*@[\\w]+([.][a-zA-Z])+") ;

        //  for only gmail id
       // p = Pattern.compile("[a-zA-Z][\\w._]*@gmail[.]com") ;

        Scanner sc = new Scanner(System.in) ;
        String str = sc.nextLine() ;
        Pattern p = Pattern.compile("[a-zA-Z][\\w._]*@gmail[.]com") ;
        Matcher m = p.matcher(str) ;  //

        if(m.find() && m.group().equals(str)){      //   ************************************
            System.out.println("gmail id is VALID ");
        }
        else{
            System.out.println("gmail id is INVALID ");
        }


    }
}
