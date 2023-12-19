package com.company;

public class reverse_number {
    public static void main(String[] args) {
      reverse(12345) ;
      System.out.println(num);
    }
    static int num = 0 ;
    static void reverse (int n){
        int rem = n%10 ;
        if(n==0){
            return ;
        }
        num = num *10 +rem ;
       // n = n/10 ;
        reverse(n/10) ;

    }

}
