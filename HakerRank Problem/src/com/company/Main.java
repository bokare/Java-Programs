package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        int count = 0 ;
        while(sc.hasNextLine()){
            count ++ ;
            System.out.println(count+" ");
            System.out.println(sc.nextLine());

        }
    }
}
