package com.company;

public class sumofdigit {
    public static void main(String[] args) {
        long num = 46L ;
        System.out.println(answer(num));
        System.out.println(akshay(num));
    }

    //  *** IMP ***
    static long akshay(long num){
        return ((num-1)%9) +1 ;
        //return num%9;
    }

    static long answer(long num){
        long newnum = 0 ;
        while(num>0){
            long rem = num%10 ;
            newnum = newnum + rem ;
            num = num/10 ;
        }
        if(newnum<10){
            return newnum ;
        }else{
            return answer(newnum);
        }
    }
}