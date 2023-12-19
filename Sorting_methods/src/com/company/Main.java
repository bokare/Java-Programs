package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String input = "vaibhav";
        System.out.println(input.repeat(1));
        output(input);
    }

    static void output(String s) {
       // String op = new String();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String zero = "0";
            // String rep = new String(new char [n]).replace("\0","0") ;
            if (ch == 'a') {
               // op = s.replace("a", zero.repeat(i));
                System.out.print(zero.repeat(i));
            }

            else if (ch == 'e') {
                //op = s.replace("e", zero.repeat(i));
                System.out.print(zero.repeat(i));
            }
            else if (ch == 'i') {
               // op = s.replace("i", zero.repeat(i));
                System.out.print(zero.repeat(i));
            }
            else if (ch == 'o') {
               // op = s.replace("o", zero.repeat(i));
                System.out.print(zero.repeat(i));
            }
            else if (ch == 'u') {
               // op = s.replace("u", zero.repeat(i));
                System.out.print(zero.repeat(i));
            } else {
                System.out.print(ch);
            }
//        System.out.println(op);
        }
    }
}
