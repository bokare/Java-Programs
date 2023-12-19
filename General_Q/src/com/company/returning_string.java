package com.company;

public class returning_string {
    public static void main(String[] args) {
        String ans = message();
        System.out.println(ans);
    }
    static String message(){
      String greet = "hello vaibhav ,Good morning" ;
      System.out.println("have a nice day");
      return greet ;
    }
}
