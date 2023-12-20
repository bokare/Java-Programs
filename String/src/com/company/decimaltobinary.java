package com.company;

public class decimaltobinary {

    public static void main(String[] args) {
        binary(10);
    }

    static void binary(int num){
        if(num==0){
            return;
        }
        int d = num % 2;
        num = num/2;
        binary(num);
        System.out.print(d);
    }
}
