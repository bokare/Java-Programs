package com.company;

class Student2{
    String name ;
    int age ;
    public void printInfo(String name){
        System.out.println("this is of parent method");
        System.out.println(name);
    }
//    public String printInfo(String name){   // return type is diff but sign is same give error
//        System.out.println("this is of parent method");
//        System.out.println(name);
//        return "" ;
//    }
    // static things
    static void printInfo(int age){
        System.out.println("this is parent things") ;
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name + " " +age);
    }

}

class Stu extends Student2{
    // we are making to String methods
    @Override
    public String toString(){
        String mystring = "hey this my created toString method which overrides the default object's toString methods" ;
        return mystring ;
    }
    @Override
    public void printInfo(String name){
        System.out.println("this is of stu method");
        System.out.println(name);
    }
    // static things  // static things can be inherited, but you can't override
    static void printInfo(int age){        //  will  execute parent method, not this
        System.out.println("this is child things ") ;
        System.out.println(age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
//        Student2 student1 = new Student2();
//        student1.printInfo("vaibhav",18);

//        Stu stu1 = new Stu();
//        stu1.printInfo("vaibhav");
//
        Student2 stu2 = new Stu(); //override the method of stu object but check if method accessible (present) in Student 2 or not

        stu2.printInfo("vaibhav bokare");
//
//        stu2.printInfo("js"); // call the stu method
//        System.out.println(stu2);
        stu2.printInfo(18);  // static things can be inherited but you can't override
//

    }

}
