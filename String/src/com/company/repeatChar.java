package com.company;

import java.util.Scanner;

public class repeatChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.nextLine() ;

        boolean find = false ;
        for( char c :str.toCharArray()){
            if(str.indexOf(c)==str.lastIndexOf(c)){
                System.out.println( str.indexOf(c) );
                find = true ;
                break ;
            }
        }
        if(!find){
            System.out.println(-1) ;
        }
    }
}
