package com.company;
class Student3{
    String name ;
    static int age ;
    static int population ;
    Student3(){
        this.population+= 1 ;
    }   //  ***  IMP  *** whenever we make the new object of class Student3 population value increase by 1
}
public class Static_methods {
    public static void main(String[] args) {
        Student3 s1 = new Student3() ;
        Student3 s2 = new Student3() ;
        s2.age = 20 ;
        System.out.println(s2.age);
        s1.age = 10 ;
        System.out.println(s2.age);
        System.out.println(s1.age);
        System.out.println(s1.population);  // as static property always remains same for all object
        System.out.println(s2.population);

    }
}
