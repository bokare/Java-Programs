package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      //  System.out.println("this is a output");

        //primitive data types          // memory in byte
        byte b = 30;                    // 1
        int i = 45698;                  // 4
        float pi= 3.14f;                // 4
        long l = 456123789546l;         // 8
        char c = 'a';                   // 2
        boolean isAdult = true ;        // 1
        short s = 58;                   // 2
        double d = 525.35633;           // 8
        System.out.println(d);

    // NON- PRIMITIVE DATA TYPE
        //STRING
        String name = "vaibhav";
        String sirname = "bokare";
        String fullname = name + " " + sirname;
     //   System.out.println(fullname);
     //   System.out.println(name.charAt(0));
     //   System.out.println(fullname.length());
        //replace
        String re = fullname.replace("bokare","b patil");
      //  System.out.println(re);
        //  System.out.println(fullname.charAt(8));
        //substring
        // System.out.println(fullname.substring(8,14));


        //ARRYS
        int[] arr = new int [5];
        arr[0] = 99;
        arr[1] = 93;
        arr[2] = 92;
        arr[3] = 95;
        arr[4] = 80;
     // System.out.println(arr);
    //  System.out.println(arr[4]);
     //   System.out.println(arr.length);
     //   System.out.println(arr[0]);

        Arrays.sort(arr);
      //sorting
     // System.out.println(arr[0]);


        int[] ar = {1,2,58,54,75};
     //   System.out.println(ar[2]);
       // System.out.println(ar);

    // TWO DIMENSIONAL ARRAYS
        int[][] tarr = new int [2][3];
        tarr[0][0] = 1;
        tarr[0][1] = 2;
        tarr[0][2] = 3;
        tarr[1][0] = 4;
        tarr[1][1] = 5;
        tarr[1][2] = 6;
    //    System.out.println(tarr[1][1]);


    // CASTING
    double profit = 100.00;
    double finalprofit = profit + 18;

   // explicit casting
    int p = 100;
    int fp = p + (int)18.18 ;
//    System.out.println(fp);

    //CONSTANT
    final float pivalue = 3.14f;
    // pivalue = 10 ; // -> cannot change constant once assigned the value

   //MATH CLASS
    //    System.out.println(Math.min((Math.min(5,6)),4));
    //    System.out.println(Math.random()*100);

    //INPUT TAKING FROM USER
        Scanner sc = new Scanner (System.in);
        System.out.println(" ENTER YOUR AGE");
        int age = sc.nextInt();
        if(age > 18)
            System.out.println("you can drive");
        else
            System.out.println("sorry you can not drive");

    }
    // this is a comment
    /*
    this is a multi line comment

    */
}

