package com.company;

interface animal{
    public int age = 2;
    static void fun(){   //  static fun can have body   ****** IMP ******

    }
    void fun2() ;
}
class horse implements animal{
    int age = 5 ;       // CAN reduce the scope of variable
    void f(){
        System.out.println(age);
    }

    @Override
    public void fun2() {    // CANNOT reduce the scope of method

    }
}

public class interfaces {
    public static void main(String[] args) {
        horse h1 = new horse() ;
        System.out.println(h1.age);
    }
}
