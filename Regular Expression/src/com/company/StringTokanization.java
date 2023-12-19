package com.company;
import java.util.StringTokenizer;

//  it is default regular expression which split by space

public class StringTokanization {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("  hi my name is vaibhav  ") ;
//        System.out.println(str);      //   java.util.StringTokenizer@7699a589
        System.out.println(str.countTokens());  //  5   // before after spaces are not contributed
        String[] arr = "  hi my name is vaibhav  ".split(" ") ;
        System.out.println(arr.length);  //  7    spaces takes contribution
        System.out.println(str.nextToken());
        System.out.println(str.nextElement());
//
//        System.out.println(str.nextToken());
//        System.out.println(str.nextElement());

        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }

        //  ex with custom pattern
        StringTokenizer st = new StringTokenizer("08/08/2001","/") ;
        System.out.println(st.countTokens());
    }
}
