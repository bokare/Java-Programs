package com.company;

import java.math.BigDecimal;
import java.util.Arrays;

public class IMP_Notes {
    public static void main(String[] args) {

        int a = 025 ;
        System.out.println(a);  // 21
        int b = 0x50 ;
        System.out.println(b);  //80

        // When an array is passed to a method, a reference of the array is received by the method.
        //Arrays are objects in java.
        //The object created with new keyword during run-time.
        //Total constructor, string class have = 13
        //What is the implicit return type of constructor = A Class Object in Which it is defined
        // finalize() - method is called before garbage collector
        // The finalize() method can be called Zero or one times.
        // Public class Solution {} ; prototype - public Solution()  : signatre - Solution() ;
        // Runnable is an INTERFACE IN JAVA ;
        // Collection interface is used to declare core methods in java.
        // Java does have the concept of pointers.
        // JDB (Java DeBugger) is used to find and fix bugs in the program.

        String ab = "cd" ;
        String cd = "bgjhgj" ;
        System.out.println(ab.compareTo(cd)); // ab.charAt(o) - cd.charAt(0) ;

        String str1 = "Interviewbi".replace('e','s');
        System.out.println(str1);
        System.out.println(Math.floor(3.6));  // 3.0  not 3
        int num = 10 ;
        num = 20 ;
        System.out.println(num);

        String str = new String("oldString") ;
        str = "bokare" ;
        System.out.println(str);
        str = new String("newString" );
        System.out.println(str);

        BigDecimal number  ;
        String defaults ;
        int n;
        //System.out.println(n);   // must be initialize , else five error
        //System.out.println(defaults);

        int[] ar = new int[2] ;
        System.out.println(Arrays.toString(ar));

    }
}
