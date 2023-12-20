package com.company;

public class Main {
    public static void main(String[] args) {
	// write your code here
        String a= "vaibhav" ;
        String b = "vaibhav" ;
        //System.out.println(a==b);  //true
        //System.out.println(a.equals(b));  //true

        String c = new String("bokare") ;
        String d = new String("bokare") ;
        //System.out.println(c==d);  //false , check for object also ;
        //System.out.println(c.equals(d)); //true   check for only values ;

        //toString
        System.out.println(56);
        Integer num = new Integer (54) ; //Wrapper class

        System.out.println(num+"a");
        System.out.println(num+5);
        System.out.println(num.toString()+5);
        String ab = num.toString() ;
        System.out.println(ab);
        //String number = 50+"" ;

    }
}
