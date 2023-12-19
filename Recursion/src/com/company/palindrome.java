package com.company;

public class palindrome {
    public static void main(String[] args) {
        int n = 123321 ;
        String s = n+"" ;
        boolean ans = palin(s ,0,s.length()-1) ;
        System.out.println(ans) ;
    }
    static boolean palin(String n ,int start ,int end){
        if(start>=end){
            return true ;
        }
        if(n.charAt(start)!= n.charAt(end)){
            return false ;
        }
        return palin(n ,start+1 ,end-1) ;
        //return true ;
    }
//  ***another best way ***
    static boolean palin2(String n ,int start ,int end) {
        if (start >= end) {
            return true;
        }
        return n.charAt(start) == n.charAt(end) && palin(n, start + 1, end - 1) ;
    }
}
