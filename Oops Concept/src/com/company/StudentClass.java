package com.company;

class Student{
    String name ;
    int age ;

    public void printInfo(){
        System.out.println(name);  //  System.out.println(this.name);
        System.out.println(age);
    }
    Student(){
        // calling another constructor from this constructor
         this("vaibhav",22) ;      //   **** IMP ****
        System.out.println("constuctor 1 called ");
    }

    Student(String myname, int myage){
        System.out.println("constuctor 2 called ");
        this.name = myname ;
        this.age = myage ;
    }

    Student(Student s1){
        System.out.println("constuctor 3 called ");
        this.name = s1.name+" bokare" ;
        this.age = s1.age+1;
    }

}
public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student();   // student() is the default constructor
//        Student s5 = new Student();  // whenever new  object is created its correspondence constructor is called ;
//        s1.printInfo();  //  null , 0
//        s1.name = "vaibhav" ;
//        s1.age = 22 ;
//
//        //System.out.println(s1.age); // 22
//        //s1.printInfo();
//
        Student s2 = new Student("vaibhav",21) ;
        s2.printInfo();

//        Student s3 = new Student(s2);
////        s3.printInfo();
//        System.out.println(s3);


    }
}
