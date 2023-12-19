package com.company;
import java.util.Scanner ;

public class Switch_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a month in digit which want to know about");
        int month = sc.nextInt() ;

        switch (month) {
            case 2, 3 -> System.out.println("this month having a SPRING season");
            case 4, 5, 6 -> System.out.println("this month having a SUMMER season");
            case 7, 8, 9 -> System.out.println("this month having a MONSOON season ");
            case 10, 11 -> System.out.println("this month having a \"AUTUMN\" summer");  // ******
            case 12, 1 -> System.out.println("this month having a 'WINTER' season");
            default -> System.out.println("invalid input");
        }

    }
}
