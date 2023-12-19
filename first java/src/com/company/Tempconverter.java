package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Tempconverter {

    public static void main(String[] args) {
	// input taking
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input something");
//        String a = sc.nextLine();
//        System.out.println("your entered no is : ");
//        System.out.println(a);
//        System.out.println("thankyou");

        //temperature converting program
       Scanner sc = new Scanner (System.in);
        System.out.println("please enter a temp in celcius ");
        float tempc = sc.nextFloat();
        float tempf = (tempc * 9/5) +32;
        System.out.println("the temp in farad is " + tempf);

    }
}
