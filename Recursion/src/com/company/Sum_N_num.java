package com.company;

public class Sum_N_num {
    public static void main(String[] args) {
        int n = 4 ;
        System.out.println(sum(n));
    }
    static int sum(int n){
        if(n==1){
            return 1 ;
        }
        return n+sum(n-1);
    }
}
