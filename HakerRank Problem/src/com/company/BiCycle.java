package com.company;

import java.util.*;
import java.io.*;

//   *****   we can call parent method in child class (in overriding) using super keyword
//    super.parentMethod() ;

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
		//  *******        calling parent method using super keyword         *********
		String temp=super.define_me(); 		//  *****
		System.out.println("My ancestor is a cycle who is "+ temp );
		BiCycle b = new BiCycle();

	}
	
}
class Solution{
	public static void main(String []args){
		MotorCycle M=new MotorCycle();
	}
}
