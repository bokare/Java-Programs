package com.company;
import java.util.Scanner;

public class datatypes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // no of test cases
        while (t > 0) {
            try{
                long num = sc.nextLong() ;
                System.out.println(num+" can be fitted in");

                if(num>=Byte.MIN_VALUE  && num<=Byte.MAX_VALUE){
                    System.out.println("* byte");
                }
                if(num>=Short.MIN_VALUE  && num<=Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(num>=Integer.MIN_VALUE  && num<=Integer.MAX_VALUE){
                    System.out.println("* int");
                }
                if(num>=Long.MIN_VALUE  && num<=Long.MAX_VALUE){
                    System.out.println("* long");
                }
            }
            catch(Exception e){
                System.out.println(sc.next()+ " can not be fitted :");  // here will not take input only print input taken at try block
            }
            t-- ;
        }

    }

    static int lowerRange(int bytes){
        int range = (int)(-(Math.pow(2,bytes*8-1))) ;
        return range ;
    }
    static int upperRange(int bytes){
        int range = (int)(Math.pow(2,bytes*8-1)-1) ;
        return range ;
    }

}
