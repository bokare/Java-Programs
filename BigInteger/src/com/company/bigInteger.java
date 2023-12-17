package com.company;
import java.math.BigInteger;    // math library
import java.util.Scanner;

public class bigInteger {
    public static void main(String[] args) {
        String n = "-11";
        BigInteger a = new BigInteger(n);
        System.out.println(n+2); //-112

        Scanner sc = new Scanner(System.in) ;
        boolean c = a.isProbablePrime(1);
        if(c){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

        BigInteger l = new BigInteger(sc.next().trim()) ;
        BigInteger m = new BigInteger(sc.next().trim()) ;

//        if(l<0 || m <0){
//            return ;
//        }
        System.out.println(l.add(m));
        System.out.println(l.multiply(m));

        int l_val = l.intValue() ;
        System.out.println(l_val + 5 );

        System.out.println(l.compareTo(m));  //  1 or -1
    }
}
