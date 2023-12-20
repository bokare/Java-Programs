package com.company;

import java.util.Scanner;

public class words_fromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        String input = scanner.nextLine().trim();

        if(input.isEmpty()){
            System.out.println("0");
            return;
        }

        String[] newData = input.split("[ ,!?._'@]+");

        System.out.println(newData.length);

        for (String data : newData) {
            System.out.println(data+"   "+ data.length());
        }
    }

}
