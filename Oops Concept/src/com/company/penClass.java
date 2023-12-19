package com.company;
import java.util.Arrays;

class pen{
    String color ;
    String type ;

    public void write(String name){
        System.out.println("hello " + name);
    }
    public void printcolor(){
        //System.out.println(color);
        System.out.println(this.color);
    }
    @Override
    public String toString(){
        return color ;
    }

}


public class penClass {
    public static void main(String[] args) {
	    pen pen1 = new pen() ;
        pen1.color = "green" ;
        pen1.type = "ballpen" ;

        pen pen2 = new pen() ;
        pen2.color = "yellow" ;
        pen2.type = "gel" ;

        System.out.println(pen1.color); // green
        System.out.println(pen2.type); // gel

        pen1.printcolor();
        pen2.printcolor();
        pen1.write("vaibhav");

        pen[] arr = new pen[2] ;
        arr[0] = pen1 ;
        arr[1] = pen2 ;
        System.out.println(arr[0]);

        System.out.println(pen1.color);     // green
        change(pen1);       // pass by reference
        System.out.println(pen1.color);     // aqua


    }

    static void change(pen pen1){
        pen1.color = "aqua" ;
    }

}
