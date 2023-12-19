package com.company;
import java.util.Scanner;

public class Ifandelse {
    /*public static void main(String[] args) {
        int a = 18 ;
        if ( a < 18){
            System.out.println("you can not drive !!");
        }
        else if (a  == 18){
            System.out.println("you are teeneger ");
        }
        else {
            System.out.println("you can drive  ");
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Please Enter Your age");
        int a = sc.nextInt();
        if ( a < 18){
            System.out.println("you can not drive !!");
        }
        else if (a  == 18){
            System.out.println("you are teeneger ");
        }
        else {
            System.out.println("you can drive  ");
        }
    }
}
