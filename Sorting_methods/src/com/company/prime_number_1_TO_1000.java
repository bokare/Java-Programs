package com.company;

public class prime_number_1_TO_1000 {
    public static void main(String[] args) {
        int c = 0 ;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 2; j <= i; ) {
                if(j == i){
                    System.out.print(i);
                    c++ ;
                    System.out.println("--" + c + "th");
                }
                if (i % j == 0) {
                    break;

                }
                j++ ;
            }
        }
    }

}

