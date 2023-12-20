package com.company;

public class palindrome_string {
    public static void main(String[] args) {
        String str = "abcba" ;
        boolean ans = palindrome(str) ;
        System.out.println(ans);

    }
    static boolean palindrome(String str){
        str = str.toLowerCase() ;
        for(int i = 0; i<str.length()/2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i) ;
            if(start!=end){
               return false ;
            }
        }
        return true ;
    }
}

