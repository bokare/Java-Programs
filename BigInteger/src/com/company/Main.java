package com.company;

import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0;i<num;i++) {
		    arr[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		int count = 1;
		
		for(int i=num-1;i>=0;i--) {
		    if(arr[i] > min) {
		        count++;
		    } 
		    
		    if(arr[i] <= min) {
		        min = arr[i];
		    }
		}
		
		System.out.println(count);
	}
}
