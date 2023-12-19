package com.company;
import java.util.Scanner;

public class counting_occurence_no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        System.out.println("enter a num which you want to count");
        int c_num = sc.nextInt();
        int count = 0 ;
        while(num>0){
            int rem = num % 10 ;
            if(rem == c_num){
                count++;
            }
            num = num/10 ;
        }
        System.out.println(count);
    }

}
