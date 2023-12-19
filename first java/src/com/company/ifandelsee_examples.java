package com.company;
import java.util.Scanner ;

public class ifandelsee_examples {
    public static void main(String[] args) {
        //pen- 10 ; book - 30 ;
        Scanner sc = new Scanner (System.in);
        System.out.println("how much cash do you have ? ");
        int cash = sc.nextInt() ;
        if (cash < 10) {
            System.out.println("sorry you can not buy anything");
            System.out.println("Please get more cash");
        }
        else if ( cash >= 10 && cash < 40){
            System.out.println("you can buy any one thing only ");
        }
        else{
            System.out.println("you can buy both pen as well as book");
        }
    }
}
