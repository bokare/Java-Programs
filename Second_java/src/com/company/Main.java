package com.company;

public class Main {

    public static void main(String[] args) {
        print(1 );
    }
    static void print(int n ){
        //System.out.println(n);
        if(n==5){
            return ;
        }
        print(n+1) ;
        System.out.println(n);
    }
}
