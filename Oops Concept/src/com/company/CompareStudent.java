package com.company;
import java.util.Arrays;

// Comapre Object
public class CompareStudent implements Comparable<CompareStudent> {
    int rollno ;
    int marks ;

    public CompareStudent(int rollno,int marks){
        this.rollno = rollno ;
        this.marks = marks ;
    }
    // java defaults comapare method we override
    @Override
    public int compareTo(CompareStudent Student2){
        System.out.println("in compareTo method");
        int diff = (int)(this.marks-Student2.marks);
        // if diff is greter than zero then Student2 is small
        return diff ;
    }
    @Override
    public String toString(){
        return marks+" " ;
    }

    public static void main(String[] args) {
        CompareStudent student1 = new CompareStudent(1,95) ;
        CompareStudent student2 = new CompareStudent(2,90) ;
        CompareStudent student3 = new CompareStudent(3,97) ;
        CompareStudent student4 = new CompareStudent(4,88) ;
        CompareStudent student5 = new CompareStudent(5,99) ;

        CompareStudent[] list = {student1,student2,student3,student4,student5} ;
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);  // sort according to marks as we have compared with marks in compareTo method
        System.out.println(Arrays.toString(list));

        if(student1.compareTo(student2)<0){
            System.out.println("student2 marks is greter");
        }
    }
}
