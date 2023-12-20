package com.company;
//import java.util.Math ;

import java.util.Date;

public class Prety_printing {
    public static void main(String[] args) {
        //float
        //we can print float number upto that decimal place which we want to print ;
        float a =  45.124436f ;
        System.out.printf("%.2f",a)  ;
        System.out.printf("\n%.3f",Math.PI);
        System.out.printf("\n%.1f" ,15.26);
        System.out.println();

        //String   // String.format() method
        String s = "hello my name is %s and  i am very %s boy" ;
        System.out.printf(s,"vaibhav","good");

        System.out.println();
        int f = 10 ;
        System.out.printf("%x",f);
        System.out.println();
        String hex = String.format("%x",f);
        System.out.println(hex);
        String d = String.format("%c",100) ;
        System.out.println(d);
        String ab = String.format("%s",10) ;
        System.out.println(ab);

        Date date = new Date() ;
        Date newdate = new Date(2023-1900,3,15) ;  // by default add 1900 so minus it
        System.out.println(newdate);
        System.out.println(date);
        System.out.println(date.compareTo(newdate));



    }
}
   /* There are many format specifiers we can use. Here are some common ones:

        %c - Character
        %d - Decimal number (base 10)
        %e - Exponential floating-point number
        %f - Floating-point number
        %i - Integer (base 10)
        %o - Octal number (base 8)
        %s - String
        %u - Unsigned decimal (integer) number
        %x - Hexadecimal number (base 16)
        %t - Date/time
        %n - Newline

    */