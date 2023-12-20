package com.company;

import java.util.Locale;

public class Q1_Valid_Palindrome {
    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama" ;
        //String s = "race a car" ;
        String s = " " ;
        System.out.println(isValid(s));

    }
    static Boolean isValid(String s){
        s = s.toLowerCase() ;
        String news = new String() ;
        for(int i = 0 ; i<s.length();i++){
            char ch = s.charAt(i) ;
            if(ch>='a' && ch<='z'){
                news = news + ch ;
            }
        }
        for(int i = 0 ; i<news.length();i++){
            char start = news.charAt(i) ;
            char last = news.charAt(news.length()-1-i) ;
            if(start!=last){
                return false ;
            }
        }
        return true ;
    }
}
