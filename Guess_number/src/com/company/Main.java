package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in) ;
        int myNum = (int)(Math.random()*100) ;
        System.out.println("guess the number (1-100) in 5 attempt : ");
        int userNum = 0 ;
        int count = 0 ;

        do {
            userNum = sc.nextInt() ;
            if(userNum == myNum){
                System.out.println("woooh! you win !!");
                break ;
            }
            else if (userNum > myNum){
                System.out.println("ohh! , please enter a smaller number");
            }
            else{
                System.out.println("ohh!, please enter a bigger number");
            }

            count++ ;
            System.out.println("remaining chances "+ (5-count));

        }while(count<5) ;
        System.out.print("my number was : ");
        System.out.println(myNum);
    }
}
