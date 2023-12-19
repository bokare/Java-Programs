package com.company;


class A{
    String name ;
    int age ;


    //  constructor
    A(int a){
       // System.out.println(a);
    }


    //  finalize method executed after any object is destroyed by garbage collector

    @Override
    protected void finalize() throws Throwable {
        System.out.println("garbage collector is called ");
    }
}

public class Garbage_collector {
    public static void main(String[] args) {

        A obj ;
        //  making too much dummy obj so load can increase
        for(int i=0 ; i<2; i++){
            obj = new A(i) ;
            System.gc();   //  garbage collector is called
        }
    }
}
