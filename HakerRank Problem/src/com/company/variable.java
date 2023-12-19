package com.company;

public class variable {
    public static void main(String[] args) {
        System.out.println(Math.pow(2,5));
        int [] arr = {1,2,3} ;
        int c = 0;
        for(int a:arr){
            System.out.print(a+"+");
            c+= a;
        }
        System.out.println("="+c);
    }
}
