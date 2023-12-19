package com.company;

import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        //System.out.println(fact(10));
        Scanner sc = new Scanner(System.in) ;
        int s = sc.nextInt();
        int e = sc.nextInt();
        for(int i=s;i<=e;i++){
            String k=i+"" ;
            int sum =0 ;
            for(int j=0;j<k.length();j++){
                sum+=fact(Integer.parseInt(k.charAt(j)+""));
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }

    static int fact(int n){
        if(n<=1){
            return 1 ;
        }
        return n*fact(n-1);
    }


}
