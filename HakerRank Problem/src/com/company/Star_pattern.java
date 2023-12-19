package com.company;

public class Star_pattern {
    public static void main(String[] args) {
        star(5) ;
        System.out.println("done");
    }
    static void star(int num){
        int n = 1 ; int start = 0 ; int last = num*2-1 ;
        for(int i=0 ;i<num; i++){
            pr(start++,last--,n++); ;
            System.out.println();
        }
        start-=2; last+=2; n-=2;
        for(int i=num ;i<num*2-1; i++){
            pr(start--,last++,n--);
            System.out.println();
        }
    }
    static void pr(int s, int l,int n){
        if(n==5){
            l = l-1 ; ;
        }
        for(int i=0 ;i<=l;i++){
            if(i==s || i==l){
                System.out.print(n);
            } else{
                System.out.print(" ");
            }
        }
    }
}
