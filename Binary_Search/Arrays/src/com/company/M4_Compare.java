package com.company;
import java.util.Arrays;

// Java program to demonstrate Arrays.compare() method . it return int

public class M4_Compare {
	public static void main(String[] args) {

		String intArr[] = { "afc","def"}; 	// in case of String array , it gives diff bet char
		String intArr1[] = {"azc","def" };		// if same it gives 0

		// To compare both arrays
		System.out.println(Arrays.compare(intArr, intArr1));  // -20


		int[] arr = {1,3,8} ;				// in case of int array it gives only out of 3 result
		int[] arr2 = {1,4,3};				//  ie  0 , 1 , -1

		System.out.println(Arrays.compare(arr,arr2));

		System.out.println("ag".compareTo("ac"));  // compareTo used to compare String , and give 0(same), -1 (if -ve diff), +ve diff
	}
}
