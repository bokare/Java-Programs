package com.company;

public class DecimalTo_Binary {

    public static void main(String[] args) {
        for(int i = 0 ; i<=15 ; i++){
            binary(i,2);
            System.out.println();
        }


    }
//    static void binary(int n, int base){
//        while(n>0){
//
//            System.out.println(n%base);
//            n= n/base;
//        }
//    }
    static void binary(int n,int base) {
        if(n==0){
            return;
        }
        binary(n/base ,base) ;
        System.out.print(n%base);

    }

}
