package com.company;

public class Alphabets_a_b {
    public static void main(String[] args) {
        String alphabets = "" ;
        for(int i= 0; i<26 ;i++){
            char ch = (char)('a'+i) ;
            //System.out.print(ch);
            alphabets = alphabets +" " + ch ;
        }
        System.out.println(alphabets);
        capital();
    }

     static void capital() {
        String Alphabets = "" ;
        for(int i= 0; i<26 ;i++){
            char ch = (char)('A' + i) ;
            //System.out.print(ch);
            Alphabets = ch +" " + Alphabets ;
        }
        System.out.println(Alphabets);
    }
}
