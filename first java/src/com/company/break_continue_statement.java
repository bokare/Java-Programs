package com.company;

public class break_continue_statement {
    public static void main(String[] args) {
//        int i= 0 ;
//        while(true){
//            System.out.println(i);
//            if(i == 5){
//                break;
//            }
//            i++ ;
//
//        }



        //continue statement
        int j = 0;
        while (true) {

            j++;
            if (j == 5) {

                continue;
            }
            System.out.println(j);
            if (j == 10) {
                break;
            }

        }
    }
}