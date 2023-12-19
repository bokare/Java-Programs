package com.company;

public class Armstrong_no {
    public static void main(String[] args) {
        for (int i = 0; i<=1000; i++ ){
            int n = i ;
            int ans = 0 ;
            while(n>0){
                int rem = n%10 ;
                ans = ans + ( rem*rem*rem) ;
                n = n/10;
            }
            if(ans==i){
                System.out.println(i);
            }
        }
    }
}
