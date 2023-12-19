package com.company;
public class Main {
    public static void main(String[] args) {
        String sc = "  vaIFHbhav [,]^ : bokare   " ;
        String(sc) ;
        System.out.println(sc);
         for(char c = 1 ; c <= 200 ;c++){
             System.out.print((char)c + " ");
         }
    }
    static void String(String sc){
        sc = sc.toLowerCase();
        for(int i =sc.length()-1; i>=0 ;i--){
            char ch = sc.charAt(i) ;
            if(ch>='a'&&ch<='z'){
                System.out.print(ch);
            }
        }
    }
}
