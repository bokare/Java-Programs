package com.company;

public class productOf_dgit{
    public static void main(String[] args) {
        int n = 55;
        int ans = product(n) ;
        System.out.println(ans);
    }
    static int product(int n){
        int rem  = n%10 ;
        if(rem==n){  //Base Condition
            return n;
        }
        n = n/10 ;
        return rem *product(n) ;
    }

}


