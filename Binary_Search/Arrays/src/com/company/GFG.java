package com.company;// Java program to illustrate creating
// an array of objects
	
class Students {
	public String name;
	Students(String name) {
		this.name = name;
	}
	@Override
	public String toString(){
		return name;
	}
}
	
// Elements of the array are objects of a class Student.
public class GFG {
	public static void main (String[] args) {
		 // declares an Array and initializing the elements of the array
		Students[] myStudents = new Students[]{ new Students("sanvi"), new Students("Rupa"),new Students("Ajay")};
	
		 //accessing the elements of the specified array
		for(Students m:myStudents){
			System.out.println(m);
		}
	}
}
