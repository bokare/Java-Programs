package com.company;

public class interchange_String_int {
    public static void main(String[] args) {

        //  String to integer
        String num = "2" ;
        int number = Integer.parseInt(num) ;
        System.out.println(number*2);

        //  integer to String
        int n = 25 ;
        String s = String.valueOf(25) ;
        System.out.println(s.charAt(1));
    }
}
