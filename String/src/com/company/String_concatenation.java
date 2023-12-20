package com.company;
import java.util.ArrayList ;

public class String_concatenation {
    public static void main(String[] args) {
        System.out.println('a'); //a
        System.out.println('a'+'b'); //195
        System.out.println("a"+"b"); //ab
        System.out.println("a" + 'b'); //ab
        System.out.println((int)('a'));  //a==97
        System.out.println('a'+3); //100
        System.out.println((char)('a'+3)); //d
        System.out.println((int)('A')); //A=65
        System.out.println('A'+5); //70
        System.out.println((char)('A'+5));  //F
        System.out.println((char)(65)); //A

        System.out.println("a"+10); //a10

        //string concatenaate with ArrayaList ;
        System.out.println("vaibhav"+new ArrayList<>());

        //string concatenaate with integer ;
        System.out.println(new Integer(45)+new String("bokare"));

        //integer concatenaate with  ArrayaList ;
        //this will not work as for concatenation atleast one argument shoud be String ;
        //System.out.println(new Integer(45) +new ArrayList<>());

        //to do this adds space or empty string as string
        System.out.println(new Integer(45) + "" + new ArrayList<>());
        String s = new Integer(95) + "" + new ArrayList<>() ;
        System.out.println(s);
        System.out.println(s.charAt(3)); // ]

    }
}