package com.company;

import java.util.Collections;

public class m {
    public static void main(String[] args) {

        System.out.println(12.0/5);        //2.4
        int a=2,b,c ;
        a=b=c = 20 ;

        System.out.println(a+" "+b+" "+c);
        int d=5,e;
        System.out.println(d+" ");
        System.out.println(Math.pow(2,3));

        a=20 ;
        b = 6 ;
        System.out.println((float)a/b);  //  *******  IMP ********      //  3.33333
        System.out.println(Math.log10(524)+1);

//        if(a=20){             // assigns a=20  in c
//            System.out.println(a);
//        }

//        for(int i=1.1 ;i<5;i++){      // in c possible
//
//        }

        for(int i=1,j=5 ;i<5 && j<10 ; i++,j++){

        }

        for(int i=1 ; i<10;i++){
            for(int j=1; j<5;j++){
                System.out.print(j*i+" ");
                if(j==3){
                    break ;
                }
            }
            System.out.println();
        }

        int n = fun() ;
        System.out.println(sum(10));

    }

    static int fun(){
        System.out.println("hello");
        return 5 ;
    }

    static int sum(int n){
        if(n==1){
            return 1 ;
        }
        return n+sum(n-1) ;
    }


}
