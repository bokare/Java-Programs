package com.company;	// Java program to demonstrate working of Comparator
// interface
import java.util.*;
import java.lang.*;

// A class to represent a student.
class Student {
	int rollno;
	String name, address;

	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

// ****  IMP  ****
class Sortbyroll implements Comparator<Student> {
	// Used for sorting in ascending order of
	// roll number
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;   // a-b
	}

	// for descending order
//	public int compare(Student a, Student b) {
//		return b.rollno - a.rollno;  //  b-a
//	}

	// for sorting  by name
//	public int compare(Student a, Student b) {
//		return a.name.compareTo(b.name);  //   compareTo() method is used to compare two String
//	}

}

public class sortby {
	public static void main(String[] args) {
		Student[] arr = { new Student(5, "anand", "london"),
						new Student(11, "anand", "nyc"),
						new Student(8, "abc", "jaipur") };

		System.out.println("Unsorted");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		Arrays.sort(arr, 0,3, new Sortbyroll());

		System.out.println("\nSorted by rollno");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
