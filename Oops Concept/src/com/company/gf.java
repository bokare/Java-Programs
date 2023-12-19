package com.company;

class vehicle{
    String name ;
    int price ;
    vehicle(){
        System.out.println("const vehicle is called");
        this.name  = "ve" ;
        this.price = 10 ;
    }

    public vehicle(String name, int price) {
        this.name = name ;
        this.price = price ;
    }

    void run(){
        System.out.println("vehicle is running parent method");
    }
}

class car extends vehicle{
    int wheel ;
    car(String name, int price , int wheel){
        super(name,price) ;
        this.wheel = wheel ;
    }

    public car() {
        System.out.println("car const is called");
    }
    void fun(){
        System.out.println("car is running child ");
    }
    void run(){
        System.out.println("car is running child method");
    }
}


public class gf {
    public static void main(String[] args) {
        vehicle cycle  = new car() ;
        System.out.println(cycle.price);
        cycle.run() ;
    }
}
