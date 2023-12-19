package com.company;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int ip = sc.nextInt();
        //pri(ip);
        //System.out.println(pr(ip));
        System.out.println(prime(9,2));
    }

    static void pri(int ip) {
        for (int i = 2; i <= ip; ) {
            if (i == ip) {
                System.out.println("yes");
                break;
            } else if (ip % i == 0) {
                System.out.println("not");
                break;
            } else {
                i++;
            }
        }
    }
    //another method
    static boolean pr(int num){
        if(num==1){
            return false ;
        }
        for (int i = 2; i < num; i++ ){
            if(num%i==0){
                return false ;
            }
        }
       return true;
    }
    static boolean prime(int number, int c){
        if(number==c || number==1){
            return true ;
        }
        return(number%c!=0 && prime(number,c+1));
    }

}
